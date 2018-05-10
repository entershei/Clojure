(defn transpose [m] (apply mapv vector m))

(defn v+ [a b] (mapv + a b))
(defn v- [a b] (mapv - a b))
(defn v* [a b] (mapv * a b))

(defn scalar [a b] (apply + (v* a b)))

(defn vect [a b]
  (let [[x1 x2 x3] a, [y1 y2 y3] b]
    [(- (* x2 y3) (* x3 y2))
     (- (* x3 y1) (* x1 y3))
     (- (* x1 y2) (* x2 y1))]))


(defn v*s [v s] (mapv (partial * s) v))

(defn m+ [a b] (mapv (partial v+) a b))

(defn m- [a b] (mapv (partial v-) a b))

(defn m* [a b] (mapv (partial v*) a b))

(defn m*s [m s]
  (mapv (fn [v] (v*s v s)) m))

(defn m*m [a b]
  (let [b (transpose b)]
    (mapv (fn [rowa]
            (mapv (fn [colb]
                    (apply + (v* rowa colb)))
                  b))
          a)))

(defn m*v [m v]
  (mapv (fn [vi] (apply + (v* vi v))) m))

