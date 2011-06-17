(ns problem1.improved)

(defn sum-of-multiples [upto n]
  "Returns the sum of all multiples of n up to the upto argument.
   O(1) solution."
  (try (let  [p (quot (- upto 1) n)]
         (/ (* (* p (+ p 1)) n) 2))
    (catch ArithmeticException e (prn "Tried to divide by zero") 0)))
    

(defn sum-multiples [upto n1 n2]
  "Returns the sum of all multiples of both n1 and n2 up to the upto argument."
  (let [sum1 (sum-of-multiples upto n1)
        sum2 (sum-of-multiples upto n2)
        commonfactors (sum-of-multiples upto (* n1 n2))]
    
    (- (+ sum1 sum2) commonfactors)))

(defn problem1 []
  "Project Euler problem 1."
  (time 
    (sum-multiples 1000 3 5)))