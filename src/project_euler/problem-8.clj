(in-ns 'project-euler.core)

(defn- digits-to-ints [digits]
  (map #(- (int %) 48) (seq digits)))

(defn- largest-product
  ([digits adjacent] (largest-product digits adjacent "" 0 (count digits)))
  ([digits adjacent ds max-product digit-count]
   (if (> digit-count adjacent)
     (let [n-digits (take adjacent digits)
           product (reduce * 1 n-digits)]
       (if (> max-product product)
         (recur (rest digits) adjacent ds max-product (dec digit-count))
         (recur (rest digits) adjacent (clojure.string/join n-digits) product (dec digit-count))))
     [ds max-product])))

(defn problem-8 [digit-string adjacent]
  (largest-product (digits-to-ints digit-string) adjacent))
