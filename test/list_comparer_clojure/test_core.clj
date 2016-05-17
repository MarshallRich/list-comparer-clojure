(ns list-comparer-clojure.test_core
  (:require [clojure.test :as t]
            [list-comparer-clojure.core :refer :all]))

(def test-list-one '(1 2 3))

(def test-list-two '(1 2 3 4))

(def test-list-three '(2 3 4))

(t/deftest compare-lists-test
  (t/is (= true (compare-lists test-list-one test-list-two)))
  (t/is (= false (compare-lists test-list-one test-list-three))))