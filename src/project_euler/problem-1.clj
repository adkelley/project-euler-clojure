(in-ns 'project-euler.core)

;; Multiples of 3 and 5
;; https://projecteuler.net/problem=1
(defn problem-1 [max-range]
  (reduce +
   (for [number (range max-range)
         :let [rem3 (rem number 3)
               rem5 (rem number 5)]
         :when (or (zero? rem3)
                   (zero? rem5))]
      number)))
