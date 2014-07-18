(ns hotline-clj.views
  (:use [hiccup core page]))

(defn index-page []
  (html5
   [:head
    [:title "Hello world"]
    [:body
     [:h1 "Hello World"]]]))

