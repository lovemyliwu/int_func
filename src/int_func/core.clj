(ns int-func.core
  (:use int-func.utils))

#_("
Python Example

number = None
for item in string:
    if number is None:
        number = int(x)
    else:
      number = 10 * number + int(x)
print(number)
")

(defn main
  "main function"
  [targetString]
  (println (format "parse %s to int" targetString))
  (reduce #(+ (* %1 10) %2)
          (for [item targetString
                :when (re-matches #"\d" (str item))
                :let [intItem (parseInt (str item))]
                ]
            intItem))
  )

(defn -main
  "the entry point"
  [arg & args]
  (println (main arg)))
