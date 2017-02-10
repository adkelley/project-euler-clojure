(in-ns 'project-euler.core)

(defn nth-prime-factor [nth]
  nth)

(defn prime?
  ([num] (prime? num 2))
  ([num i]
   (cond
     (= i 6) true
     (= (rem num i) 0) false
     :else (recur num (inc i)))))

(defn nth-prime-factor
  ([nth] (nth-prime-factor nth 4 8 7))
  ([nth n z prime]
   (cond
     (= n nth) prime
     (prime? z) (recur nth (inc n) (inc z) z)
     :else (recur nth n (inc z) prime))))

(defn problem-7 [nth]
  (cond
    (= nth 1) 2
    (= nth 2) 3
    (= nth 3) 5
    :else (nth-prime-factor nth)))
