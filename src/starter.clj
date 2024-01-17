(ns starter
  (:require
    [io.github.humbleui.ui :as ui]))

(ui/defcomp app []
  [ui/center
   [ui/label "Hello, world"]])
  
(defn -main [& args]
  (ui/start-app!
    (ui/window #'app)))