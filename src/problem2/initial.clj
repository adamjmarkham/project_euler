(ns problem2.initial)

(defn fib-even-sum [upto]
  (loop [previous 1 nxt 1 sum 0]
    (if (or (<= upto 1) (>= nxt upto))
     sum
     (recur nxt (+ previous nxt) (if (even? nxt) (+ sum nxt) sum)))))

(defn problem2 []
  (time (fib-even-sum 4000000)))
