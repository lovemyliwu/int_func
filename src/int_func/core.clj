(ns int-func.core
  (:use int-func.utils)
  (:require
    [int-func.utils :as utils]))

(defn -main
  "the entry point"
  [name number-string]
  (say
    (format "smite %s" name))
  (print
    (utils/myint number-string)))
