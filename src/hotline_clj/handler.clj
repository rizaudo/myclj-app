(ns hotline-clj.handler
  (:use hotline-clj.views)
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            ))

(defroutes app-routes
  (GET "/" [] (index-page))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
