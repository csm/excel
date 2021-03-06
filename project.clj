(defproject io.bfpcorporation/excel "0.2.6-SNAPSHOT"
  :description "A thin Clojure wrapper around a small part of Apache POI for
                reading .xlsx files."
  :url "http://github.com/csm/excel"
  :license {:name "Simplified BSD License"
            :url "http://opensource.org/licenses/BSD-2-Clause"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [org.apache.poi/poi-ooxml "3.16"]]
  :profiles
  {:dev {:dependencies [[midje "1.6.3"]
                        [lazytest "1.2.3"]]
         :plugins [[lein-midje "3.1.3"]
                   [lein-marginalia "0.7.1"]]}}
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version"
                   "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag"]
                  ["deploy" "clojars"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]])
