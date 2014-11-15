(defproject power-api-clojure "0.1.0-SNAPSHOT"
  :description "power-api clojure version"
  :url "https://github.com/orgs/where-is-your-power"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [io.vertx/clojure-api "1.0.4"]
                 [com.cognitect/transit-clj "0.8.259"]]
  :plugins [[lein-vertx "0.3.1"][cider/cider-nrepl "0.7.0"]]
  :main power-api-clojure.core
  :vertx {:main power-api-clojure.core/init
          :author "Raymond Kroon"
          :keywords ["Powerrrrr"]
          :developers ["Raymond"]}
)
