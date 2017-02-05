(in-ns 'project-euler.core)

;; Largest prime factor
;; https://projecteuler.net/problem=3

(defn prime-factors [max]
  (loop [n max z 3 pf []]
   (cond
    (> (* z z) max) pf
    (= (rem n z) 0) (recur (/ n z) z (cons z pf))
    :else (recur n (+ z 2) pf))))

(defn problem-3 [n]
  (first (prime-factors n)))
