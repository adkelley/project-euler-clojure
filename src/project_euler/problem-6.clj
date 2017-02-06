(in-ns 'project-euler.core)

(defn square-sum [nat]
 (loop [n nat acc 0]
   (if (= n 0)
     (* acc acc)
     (recur (dec n) (+ acc n)))))

(defn sum-squares [nat]
  (loop [n nat acc 0]
    (if (= n 0)
      acc
      (recur (dec n) (+ acc (* n n))))))

(defn sum-square-difference [nat]
  (- (square-sum nat) (sum-squares nat)))

(defn problem-6 [nat]
 (sum-square-difference nat))
