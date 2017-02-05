(in-ns 'project-euler.core)

(defn evenly-divisible?
 ([rangeMax dividend] (evenly-divisible? rangeMax dividend 2))
 ([rangeMax dividend divisor]
  (cond
    (> divisor rangeMax) true
    (not (= (mod dividend divisor) 0)) false
    :else (recur rangeMax dividend (inc divisor)))))

(defn smallestMultiple
  ([rangeMax] (smallestMultiple rangeMax (+ rangeMax 2)))
  ([rangeMax smallest]
   (if (evenly-divisible? rangeMax smallest)
     smallest
     (recur rangeMax (+ smallest 2)))))



(defn problem-5 [rangeMax]
  (smallestMultiple rangeMax))
