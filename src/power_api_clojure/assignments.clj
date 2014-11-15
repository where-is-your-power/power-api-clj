(ns power-api-clojure.assignments)

(defrecord Question [question required-answer])
(defrecord Assignment  [assignment description time-allowed old-compared-to-new power-type questions])

(def all[
         (map->Assignment {:assignment "Zet de lampen uit" :time-allowed 60 :questions [(->Question "Staan je lampen aan?" true)] } )
   ])

(defn random []
  (rand-nth all
 ))
