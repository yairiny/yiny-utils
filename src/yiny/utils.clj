(ns yiny.utils)

(defn to-int [x]
  (if (= String (type x))
    (.intValue (Integer/valueOf x))
    (.intValue x)))
