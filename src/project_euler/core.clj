(ns project-euler.core
  (:gen-class :main true))

(load "problem-1")
(load "problem-2")
(load "problem-3")
(load "problem-4")

(defn -main
  "I'm solving the Euler problems - woo hoo!"
  [& args]
  (println "Project Euler")
  (println (str "Problem 1: " (vec problem-1)))
  (println (str "Problem 2: " (problem-2 4000000)))
  (println (str "Problem 3: " (problem-3)))
  (println (str "Problem 4: " (problem-4))))
