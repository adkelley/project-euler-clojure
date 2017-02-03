(defproject project-euler "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [proto-repl "0.3.1"]]
  :plugins [[lein-auto "0.1.3"]]
  :main ^:skip-aot project-euler.core
  :source-paths ["src"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
