(ns reasons-for-clojurescript.core
  (:require [clojure.string :as string]
            [reagent.core :as r]
            [hickory.core :as h]))

(def click-count (r/atom 0))

(defn count-button []
  [:input {:type "button"
            :value "Click me!"
            :on-click #(swap! click-count inc)
            :style {:background-color "#CC0000"
                    :color "#9000FF"
                    :box-shadow "4px 4px 4px #222222"}}])

(def header
  [:header
  [:h1 "Reasons for Clojurescript"]
  [:h3 "A look at the future of web design"]])

(def content (r/atom ""))

(def footer [:footer [:p "\u00A9 Ryan Haney"]])

(defn page [c]
  [:div
  header
  @c
  footer])

(defn start []
  (reset! content (.-innerHTML (.getElementById js/document "root")))
  (swap! content (comp
    first
    (partial map h/as-hiccup)
    h/parse-fragment))
  (r/render-component
   [page content]
   (.getElementById js/document "root")))