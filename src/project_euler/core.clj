(ns project-euler.core
  (:gen-class :main true))

(load "problem-1")
(load "problem-2")
(load "problem-3")
(load "problem-4")
(load "problem-5")
(load "problem-6")
(load "problem-7")
(load "problem-8")

(def digit-string
   (try
     (clojure.string/replace (slurp "./resources/pe8.txt") "\n" "")
     (catch Exception e ("0"))))

(defn -main
  "I'm solving the Euler problems - woo hoo!"
  [& args]
  (println "Project Euler")
  (println (str "Problem 8: " (problem-8 digit-string 13)))
  (println (str "Problem 7: " (problem-7 10001)))
  (println (str "Problem 6: " (problem-6 100)))
  (println (str "Problem 5: " (problem-5 20)))
  (println (str "Problem 4: " (problem-4 100)))
  (println (str "Problem 3: " (problem-3 600851475143)))
  (println (str "Problem 2: " (problem-2 4000000)))
  (println (str "Problem 1: " (problem-1 1000))))
