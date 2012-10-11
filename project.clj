(defproject com.cemerick/drawbridge "0.0.6"
  :description "HTTP transport support for Clojure's nREPL implemented as a Ring handler."
  :url "http://github.com/cemerick/drawbridge"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/tools.nrepl "0.2.0-beta5"]
                 [ring/ring-core "1.0.2"]
                 [cheshire "4.0.3"]

                 ;; client
                 [clj-http-lite "0.2.0"]]
  :dev-dependencies [[ring "1.0.0"]]
  :profiles {:dev {:dependencies [[ring "1.0.0"]]
                   :plugins [[lein-clojars "0.9.0"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}}
  :main ^{:skip-aot true} cemerick.drawbridge)
