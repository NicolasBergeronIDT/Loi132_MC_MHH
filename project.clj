(defproject loi132 "0.1.0-SNAPSHOT"
  :description "Compensation pour pour l'atteinte aux milieux humides
  et hydriques. Projet de règlement. Loi sur la qualité de
  l'environnement (chapitre Q-2). Gazette officelle du Québec (23 mai
  2018) "
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  ;:main ^:skip-aot loi132.core)
  :main loi132.core
  :aot [loi132.core])
