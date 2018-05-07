(defn lecture [name]
  (println)
  (let [line (clojure.string/join (repeat (+ 16 (count name)) "="))]
    (println line)
    (println "=== Lecture" name "===")
    (println line)))

(defn chapter [name]
  (println)
  (println "==========" name "=========="))

(defn section [name]
  (println)
  (println "---" name "---"))


(defn safe-eval [expression]
  (try
    (str (eval expression))
    (catch Throwable e (str (.getSimpleName (type e)) ": " (.getMessage e)))))

(defn example' [prefix & expressions]
  (letfn [(out [expression]
            (str expression " -> " (safe-eval expression)))]
    (println (clojure.string/join "\n        " (cons (str "    " prefix) (map out expressions))))))

(defn example [description & expressions]
  {:pre [(not (empty? expressions))]}
  (apply example' (cons (str description ": ") expressions)))
