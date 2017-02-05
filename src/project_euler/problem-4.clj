(in-ns 'project-euler.core)

;; Largest palindrome product"
;; https://projecteuler.net/problem=4
(defn- palindrome? [number]
  (= (str number) (clojure.string/reverse (str number))))

(defn problem-4 [digits]
  (apply max
    (for [n-digit-number1 (range digits (* 10 digits))
          n-digit-number2 (range digits (* 10 digits))
          :let [product (* n-digit-number1 n-digit-number2)]
          :when (palindrome? product)]
       product)))
