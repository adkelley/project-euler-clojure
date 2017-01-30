(ns project-euler.main)

;; Multiples of 3 and 5
;; https://projecteuler.net/problem=1
(defn problem-1 []
  (for [number (map inc (range 999))
        :let [rem3 (rem number 3)
              rem5 (rem number 5)]
        :when (or (zero? rem3)
                  (zero? rem5))]
    number))

;; Even Fibonacii Numbers
;; https://projecteuler.net/problem=2
(def fib-seq-iterate
  (while (< (map first
                 (iterate
                   (fn [[a b]] [(bigint b) (bigint (+ a b))]) [0 1]))
            5)))

; (defn problem-2 []
;   (reduce + (filter even? fib-seq-iterate)))

(while (< (range 1000) 5) println "hi")
;; Largest palindrome product
;; https://projecteuler.net/problem=4
(defn- palindrome? [number]
  (= (str number) (clojure.string/reverse (str number))))

(defn problem-4 []
  (apply max
    (for [three-digit-number1 (range 100 1000)
          three-digit-number2 (range 100 1000)
          :let [product (* three-digit-number1 three-digit-number2)]
          :when (palindrome? product)]
       product)))

(defn -main
  "I'm solving the Euler problems - woo hoo!"
  [& args]
  (println "Project Euler")
  (println (str "Problem 1: " (seq (problem-1))))
  (println (str "Problem 4: " (problem-4))))
