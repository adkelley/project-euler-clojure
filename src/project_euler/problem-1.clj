(in-ns 'project-euler.core)

;; Multiples of 3 and 5
;; https://projecteuler.net/problem=1
(def problem-1
  (for [number (map inc (range 999))
        :let [rem3 (rem number 3)
              rem5 (rem number 5)]
        :when (or (zero? rem3)
                  (zero? rem5))]
    number))
