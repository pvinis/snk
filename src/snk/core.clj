(ns snk.core)







(defn snk-reading
  [messages user]
  (clojure.string/join (map (fn [message]
                              (str (first message) " (" (second message) " sec)\n"))
                            (messages user))))
