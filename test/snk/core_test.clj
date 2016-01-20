(ns snk.core-test
  (:use clojure.test snk.core))
;;  (:require [clojure.test :refer :all]
  ;;          [snk.core :refer :all]))

(def test-messages {:alice [["hello" 10]
                            ["hello again" 25]]
                    :bob [["hello from me too" 15]]})

(deftest reading
  (testing "reading"
    (is (= (snk-reading test-messages :alice) "hello (10 sec)\nhello again (25 sec)\n"))))
;;; make a test for a new user
