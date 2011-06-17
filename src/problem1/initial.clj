(ns problem1.initial)

(defn sum-multiples [upto n1 n2]
  "Returns the sum of all multiples of n1 and n2 up to the upto argument."
  (reduce + 
          (into #{} 
                (concat (range 0 upto n1)
                        (range 0 upto n2)))))

(defn problem1 []
  "Project Euler problem 1."
  (time
    (sum-multiples 1000 3 5)))
  

    