(ns reasons-for-clojurescript.prod
  (:require [reasons-for-clojurescript.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
