(in-ns 'project-euler.core)

;; Largest prime factor
;; https://projecteuler.net/problem=3

(defn prime-factors
  ([max] (prime-factors max max 3 []))
  ([max n z pf]
   (cond
    (> (* z z) max) pf
    (= (rem n z) 0) (recur max (/ n z) z (cons z pf))
    :else (recur max n (+ z 2) pf))))

(defn problem-3 [n]
  (first (prime-factors n)))
