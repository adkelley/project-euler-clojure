(ns projecteuler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]))

(deftest p1-test
  (testing
    "1: The sum of the multiples of 3 & 5 for natural numbers < 10 should equal 23 -> "
    (is (= (problem-1 10) 23))))

(deftest p2-test
  (testing
    "2: The sum of the even-valued fibonacci terms < 89 should equal 44 -> "
    (is (= (problem-2 89) 44))))

(deftest p3-test
  (testing
    "3: The largest prime factor of 13195 should equal 29 -> "
    (is (= (problem-3 13195) 29))))

(deftest p4-test
  (testing
    "4: The largest palindrome of the product of two 2-digits numbers should be 9009 -> "
    (is (= (problem-4 10) 9009))))
