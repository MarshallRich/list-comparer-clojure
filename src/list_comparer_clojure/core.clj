(ns list-comparer-clojure.core
  (:gen-class))



(defn compare-lists [list-one list-two]
  (let [contained (atom 0)]
       (doseq [item list-one]
          (if
            (>= (count (filter
                        (fn [a]
                          (= a item))
                        list-two)) 1) 
            (swap! contained inc)))
    
       (if 
          (>= @contained (count list-one))
          true
          false)))
    

(defn -main []
  (def list-one '(1 2 3))
  (def list-two '(1 2 3 4))
  (println (compare-lists list-one list-two)))
