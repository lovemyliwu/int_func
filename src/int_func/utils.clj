(ns int-func.utils)

(def mapping
  {
   :0 0,
   :1 1,
   :2 2,
   :3 3,
   :4 4,
   :5 5,
   :6 6,
   :7 7,
   :8 8,
   :9 9,
   })

(defn parseInt
  "parse char to int"
  [item]
  (println (format "parse %s to int" item))
  ((keyword (str item)) mapping))
