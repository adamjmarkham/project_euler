(ns problem1.improved-test
  (:use problem1.improved)
  (:use [clojure.test]))

;test solution to problem is 233168
(deftest problem1-test 
  (is (= (problem1) 233168)))

;test the sum-multiples function works
;test for zero argument
;test other multiples and larger numbers
;test up to 5 billion
(deftest sum-multiples-test 
  (is (= (sum-multiples 1000 3 5) 233168))
  (is (= (sum-multiples 1000 5 3) 233168))
  (is (= (sum-multiples 10 3 5) 23))
  (is (= (sum-multiples 10 5 3) 23))
  (is (= (sum-multiples 10000 4 1) 49995000))
  (is (= (sum-multiples 10000 1 4) 49995000))
  (is (= (sum-multiples 10 4 0) 12))
  (is (= (sum-multiples 10 0 4) 12))
  (is (= (sum-multiples 10000 0 0) 0))
  (is (= (sum-multiples 5000000000 8 7) 3124999997500000005))
  (is (= (sum-multiples 5 10 20) 0)))

;test sum-of-multiples function
;test for zero argument
;test up to 5 billion
(deftest sum-of-multiples-test
  (is (= (sum-of-multiples 10 5) 5))
  (is (= (sum-of-multiples 10 4) 12))
  (is (= (sum-of-multiples 2 1) 1))
  (is (= (sum-of-multiples 1 2) 0))
  (is (= (sum-of-multiples 0 0) 0))
  (is (= (sum-of-multiples 5000000000 1) 12499999997500000000)))