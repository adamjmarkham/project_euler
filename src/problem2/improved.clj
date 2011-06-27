(ns problem2.improved)

(def fibs
  (map second (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn even-fibs-to [upto]
  (reduce + (filter even? (take-while #(< % upto) fibs))))

(defn problem2 []
  (even-fibs-to 4000000))
  
  





