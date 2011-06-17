(ns problem1.initial-test
  (:use problem1.initial)
  (:use [clojure.test]))

;test solution to problem is 233168
(deftest problem1-test 
  (is (= (problem1) 233168)))

;test the sum-multiples function works
;test for zero argument
;test other multiples and larger numbers
;no test up to larger numbers will generate out of memory error
(deftest sum-multiples-test 
  (is (= (sum-multiples 1000 3 5) 233168))
  (is (= (sum-multiples 1000 5 3) 233168))
  (is (= (sum-multiples 10 3 5) 23))
  (is (= (sum-multiples 10 5 3) 23))
  (is (= (sum-multiples 10000 4 1) 49995000))
  (is (= (sum-multiples 10000 1 4) 49995000))
  (is (= (sum-multiples 10 4 0) 12))
  (is (= (sum-multiples 10 0 4) 12))
  (is (= (sum-multiples 10000 0 0) 0)))