(in-ns 'project-euler.core)

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
