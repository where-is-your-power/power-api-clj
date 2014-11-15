(ns power-api-clojure.users
  (:refer-clojure :exclude [get]))

(defprotocol Points
  (add-point [p])
  (reset-points [p]))

(defrecord User [name points]
  Points
  (add-point [p]
    (assoc p :points (inc points)))
  (reset-points [p]
    (assoc p :points 0)))

(defprotocol UserRepository
  (get [repo id])
  (successful-assignment [repo id]))

(def users (ref {}))

(defn leaderboard
  [topn]
  (->> @users (sort-by :points) reverse (take topn) (map second) (into [])))

(defn get
  [id]
  (let [user (@users id)]
    (if (nil? user)
      (->User id 0)
      user)))

(defn save
  [id user]
  (dosync
   (alter users update-in [id] (fn [_] user))))
