(ns power-api-clojure.routes
  (:require [vertx.http :as http]
            [vertx.http.route :as route]
            [vertx.buffer :as buffer]
            [cognitect.transit :as transit]
            [power-api-clojure.smallfacts :as facts]
            [power-api-clojure.assignments :as assigments]
            [power-api-clojure.users :as users])
  (:import  [java.io ByteArrayOutputStream]))

(declare text-response)
(declare tjson)

(defn whoops
  [req]
  (text-response req "whoops"))

(defn small-fact
  [req]
  (text-response req (facts/random-fact)))

(defn user-info
  [req]
  (tjson req (users/get (:user (http/params req))) ))

(defn new-assignment
  [req]
  (tjson req (assigments/random)))

(defn successful-assignment
  [req]
  (let [userid (:user (http/params req))
        user (users/get userid)
        successful-user (users/add-point user)]
    (users/save userid successful-user)
    (tjson req successful-user)))

(defn failed-assignment
  [req]
  (let [userid (:user (http/params req))
        user (users/get userid)
        failed-user (users/reset-points user)]
    (users/save userid failed-user)
    (tjson req failed-user)))

(defn leaderboard
  [req]
  (let [topn  (Integer. (:topn (http/params req)))]
    (tjson req (users/leaderboard topn))))

(defn text-response
  [req response]
  (-> (http/server-response req)
      (http/add-header "Content-Type" "text/plain")
      (http/end response)))

(defn serialize
  [record]
  (let [out (ByteArrayOutputStream.)
        writer (transit/writer out :json)]
    (transit/write writer record)
    (.toByteArray out))
  )

(defn tjson
  [req record]
  (-> (http/server-response req)
      (http/add-header "Content-Type" "application/transit+json")
      (http/end (buffer/buffer (serialize record)))))

(def all
  (-> (route/get "/smallfact" small-fact)
      (route/get "/assignment/new/:user" new-assignment)
      (route/get "/assignment/success/:user" successful-assignment)
      (route/get "/assignment/fail/:user" failed-assignment)
      (route/get "/user/:user" user-info)
      (route/get "/leaderboard/:topn" leaderboard)
      (route/no-match whoops)))
