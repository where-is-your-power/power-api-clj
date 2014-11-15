(ns power-api-clojure.core
  (:require [vertx.core :as vertx]
            [vertx.http :as http]
            [clojure.string :as s]
            [power-api-clojure.routes :as routes]))

(def PORT "PORT")
(def DEFAULT_PORT 80)

(defn req-handler [req]
  (println "Got request:" (.uri req))
  (println "Headers are:" (pr-str (http/headers req)))
  (-> (http/server-response req)
      (http/add-header "Content-Type" "text/html; charset=UTF-8")
      (http/end "<html><body><h1>Hello from vert.x!</h1></body></html>")))

(defn init
  [& args]
  (let [env (into {} (vertx/env))
        port (if (s/blank? (env PORT)) DEFAULT_PORT (env PORT))]
    (println port)

    (-> (http/server)
        (http/on-request routes/all)
        (http/listen port "localhost")))
  )
