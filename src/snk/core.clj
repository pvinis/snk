(ns snk.core)

(defn snk-reading
  [messages user]
  (clojure.string/join (map (fn [message]
                              (str (first message) " (" (second message) " sec)\n"))
                            (messages user))))

(defn snk-posting
  [messages user message]
  (let [old-messages messages
        new-messages (assoc old-messages user (conj (old-messages user []) [message snk-current-time]))]
    new-messages))




;;not ready stuff
(def snk-current-time 40)

(snk-posting msg :bob "how")

(def msg {:alice [["hello" 10]
                  ["hello again" 25]]
          :bob [["hello from me too" 15]]})

;(update-in msg [:charlie] (fnil conj []) ["third" 40])
