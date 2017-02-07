(in-ns 'project-euler.core)

(defn nth-prime-factor [nth]
  nth)

(defn prime?
  ([num] (prime? 2 num))
  ([i num]
   (cond
     (= i 6) true
     (= (rem num i) 0) false
     :else (recur (inc i) num))))

(defn nth-prime-factor
  ([nth] (nth-prime-factor 4 8 7 nth))
  ([n z prime nth]
   (cond
     (= n nth) prime
     (prime? z) (recur (inc n) (inc z) z nth)
     :else (recur n (inc z) prime nth))))

(defn problem-7 [nth]
  (cond
    (= nth 1) 2
    (= nth 2) 3
    (= nth 3) 5
    :else (nth-prime-factor nth)))
