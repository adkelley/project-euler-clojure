(ns projecteuler.core)

(defn problem-1 []
  (for [number (map inc (range 9))
        :let [rem3 (rem number 3)
              rem5 (rem number 5)]
        :when (or (zero? rem3)
                  (zero? rem5))]
      number))
