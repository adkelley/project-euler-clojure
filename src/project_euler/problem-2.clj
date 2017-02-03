(in-ns 'project-euler.core)

;; Even Fibonacii Numbers
;; https://projecteuler.net/problem=2
(def fib-seq-iterate
  (map first (iterate
                (fn [[a b]]
                  [(bigint b) (bigint (+ a b))])
                [1 2])))

(defn problem-2 [max-num]
  (reduce + (filter even?
                (take-while #(< % max-num) fib-seq-iterate))))
