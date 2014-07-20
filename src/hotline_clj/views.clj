(ns hotline-clj.views
  (:use [hiccup core page])
  (:import (java.util Date)))

(defn index-page []
  (html5
   [:head
    [:title "Hello world"]
    [:body
     [:h1 "Hello World"]
     [:h2 (.toString (Date.))]]]))

