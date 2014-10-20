(defproject polismath "0.1.0-SNAPSHOT"
  :source-paths ["src/"
                 "src/polismath/"
                 ".lein-git-deps/debug-repl/src/"
                 ".lein-git-deps/tools.cli/src/main/clojure/"]
  ;:aot :all
  ; faster run time in exchange for slower startup time
  :jvm-opts ^:replace []
  :target-path "target/%s"
  :javac-target "1.7"
  :repositories {"twitter4j" "http://twitter4j.org/maven2"}
  :plugins [[lein-git-deps "0.0.1-SNAPSHOT"]
            [lein-gorilla "0.3.3"]
            [lein-environ "0.4.0"]]
  :git-dependencies [["https://github.com/Prismatic/hiphip.git" "master"]
                     ["https://github.com/metasoarous/tools.cli.git" "master"]
                     ["https://github.com/GeorgeJahad/debug-repl.git" "master"]]
  :dependencies [[commons-collections/commons-collections "3.2.1"]
                 [cheshire "5.3.1"]
                 [org.clojure/tools.reader "0.8.4"]
                 [com.taoensso/timbre "3.1.6"]
                 [net.mikera/core.matrix "0.23.0"]
                 [net.mikera/core.matrix.stats "0.3.0"]
                 [net.mikera/vectorz-clj "0.19.0"]
                 [criterium "0.4.2"]
                 [clj-http "1.0.0"]
                 [org.clojure/clojure "1.5.1"]
                 [org.clojure/core.async "0.1.303.0-886421-alpha"]
                 [org.clojure/data.csv "0.1.2"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [org.clojure/core.match "0.2.1"]
                 [org.clojure/tools.namespace "0.2.7"]
                 [org.clojure/tools.logging "0.3.0"]
                 [org.clojure/tools.trace "0.7.6"]
                 ;[org.clojure/tools.cli "0.3.1"]
                 [org.apache.storm/storm-core "0.9.2-incubating"]
                 [bigml/sampling "2.1.0"]
                 [incanter "1.5.4"]
                 [com.novemberain/monger "2.0.0"]
                 [org.postgresql/postgresql "9.2-1004-jdbc4"]
                 [korma "0.3.0-RC5"]
                 [clj-time "0.6.0"]
                 [prismatic/plumbing "0.2.0"]
                 [environ "0.4.0"]]
  :min-lein-version "2.3.0"
  :profiles {
    :dev {
      :env {
        :mongo-url "db/mongo.db"}}
    :production {
      :env {}}})
