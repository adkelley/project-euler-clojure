(ns projecteuler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]))

(deftest p8-test
  (let [digits "73167176531330624919225119679989574742355349194934969835203127745063262395783"]
    (testing
      "8: The four adjacent digits that have the greatest product are 9 × 9 × 8 × 9 = 5832"
      (is (= (problem-8 digits 4) ["9989", 5832])))))

(deftest p7-test
  (testing
    "7: The sixth prime number is 13"
    (is (= (problem-7 6) 13))))

(deftest p6-test
  (testing
    "6: The Sum square difference of the first 10 natural numbers should be 2640"
    (is (= (problem-6 10) 2640))))

(deftest p5-test
  (testing
    "5: The smallest multiple of numbers from 1 to 10 should be 2520"
    (is (= (problem-5 10) 2520))))

(deftest p4-test
  (testing
    "4: The largest palindrome of the product of two 2-digits numbers should be 9009"
    (is (= (problem-4 10) 9009))))

(deftest p3-test
  (testing
    "3: The largest prime factor of 13195 should equal 29"
    (is (= (problem-3 13195) 29))))

(deftest p2-test
  (testing
    "2: The sum of the even-valued fibonacci terms < 89 should equal 44"
    (is (= (problem-2 89) 44))))

(deftest p1-test
  (testing
    "1: The sum of the multiples of 3 & 5 for natural numbers < 10 should equal 23"
    (is (= (problem-1 10) 23))))
