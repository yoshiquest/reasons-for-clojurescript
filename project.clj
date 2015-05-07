(defproject reasons-for-clojurescript "0.0.1"
  :description "A short reagent tutorial"
  :url "https://github.com/jonase/reagent-tutorial"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2850"]
                 [reagent "0.5.0-alpha3"]
                 [hickory "0.5.4"]]
  :plugins [[lein-cljsbuild "1.0.6-SNAPSHOT"]]
  :cljsbuild {:builds [{:source-paths ["src-cljs"]
                        :compiler {:output-to "app.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
