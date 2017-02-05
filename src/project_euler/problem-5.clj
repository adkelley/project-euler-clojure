(in-ns 'project-euler.core)

(defn evenly-divisible? [rangeMin rangeMax dividend]
  (loop [divisor rangeMin]
    (cond
      (> divisor rangeMax) true
      (not (= (rem dividend divisor) 0)) false
      :else (recur (inc divisor)))))

;; optimizations
;; A number must be even if it is divisible by all numbers in a range > 2,
;; so increment smallest by 2 instead of 1

(defn smallestMultiple [rangeMin rangeMax]
  (loop [smallest (+ rangeMax 2)]
    (if (evenly-divisible? rangeMin rangeMax smallest)
      smallest
      (recur (+ smallest 2)))))

;; optimizations
;; Start rangeMin from the last 9 numbers of RangeMax otherwise
;; your solving the problem more than once

(defn problem-5 [rangeMax]
  (if (> rangeMax 10)
    (smallestMultiple (- rangeMax 9) rangeMax)
    (smallestMultiple 2 rangeMax)))
