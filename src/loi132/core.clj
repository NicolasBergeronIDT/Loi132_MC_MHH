(ns loi132.core
  (:use [clojure.repl])
  (:gen-class))

;; Loi132
;;
;; MC=(ct+vt)*S
;;
;; Sachant que;
;;
;; ct     = cb*famhh*R
;; R      = FacteursRegionauxParMRC (Annexe IV)
;; cb     = CoutDeRehabilitationAuMetreCarre (constante=20$/m2)
;; famhh  = lfini-lffin (Atteinte à un milieu humide)
;; lffin  = lfini*ni
;; vt     = ValeurTerrainAuCompteDeTaxes_$
;; sup    = SuperficieTotaleAuCompteDeTaxes_M2
;; S      = SuperficieDuMileuAffecte_M2
;; lfini  = État initial du milieu humide

;; Fonction primaire: loi
(defn loi
  "lfini ni R vt1 sup s"
  [lfini ni R vt1 sup s]
  (let [cb  20
        ct  (* cb (- lfini (* lfini ni)) R)
        vt2 (/ vt1 sup)
        S   s]
    ;(println "Coût de base à la réhabilitation (cb) ($/m2):" cb)
    ;(println "État initial (LfINI):" lfini)
    ;(println "Impact de l'activité (NI):" ni)
    ;(println "Facteur de modulation régionale (R):" R)
    ;(println "Valeur du terrain au compte de taxes ($):" vt1)
    ;(println "Superficie totale du terrain au compte de taxes (m2):" sup)
    ;(println "Valeur du terrain au mètre carré ($):" vt2)
    ;(println "Superficie affectée (m2) (s):" S)
    ;(println ".")
    ;(println "..")
    ;(println "...")
    ;(println "Montant contribution exigible (MC) ($):" (* (+ ct vt2) S) " $")
    (println "Desole pour les accents mais $window$ oblige sans UTF8")
    (println "Cout de base a la rehabilitation (cb) ($/m2):" cb)
    (println "Etat initial (LfINI):" lfini)
    (println "Impact de l'activite (NI):" ni)
    (println "Facteur de modulation regionale (R):" R)
    (println "Valeur du terrain au compte de taxes ($):" vt1)
    (println "Superficie totale du terrain au compte de taxes (m2):" sup)
    (println "Valeur du terrain au metre carre ($):" vt2)
    (println "Superficie affectee (m2) (s):" S)
    (println ".")
    (println "..")
    (println "...")
    (println "Montant contribution exigible (MC) ($):" (* (+ ct vt2) S) " $")
    ))

;; Source
;; (source loi)
(defn print-src []
  (println (with-out-str (clojure.repl/source loi))))

;; run with cyder-jack-in
;; (loi 1 0 1.2 88100.00 220212.20 100)

;; Float
;; (+ 0.00 (Float/parseFloat "41.5"))
;; -------------
;; Fonction MAIN
;; -------------
(defn -main [& args]
"Ajouter, à la suite les unes des autres, et séparées par un espace,
les valeurs initiale suivantes pour le calcul de la contribution:

lfini ni R vt1 sup s

Sachant que:
État initial (LfINI): lfini
Impact de l'activité (NI): ni
Facteur de modulation régionale : R
Valeur du terrain au compte de taxes ($): vt1
Superficie totale du terrain au compte de taxes (m2): sup
Superficie affectée (m2) : s

Ajuster ces valeurs pour chacun des cas.
-
java -jar {PATH}/loi132-0.1.0-SNAPSHOT-standalone.jar 1 0 1.2 88100.00 220212.20 100
-
"
  (let [lfini (Float/parseFloat (nth args 0))
        ni    (Float/parseFloat (nth args 1))
        R     (Float/parseFloat (nth args 2))
        vt1   (Float/parseFloat (nth args 3))
        sup   (Float/parseFloat (nth args 4))
        s     (Float/parseFloat (nth args 5)) ;;; YEP
        x     10
        param (conj [lfini ni R vt1 sup s])
        ]
    ; defn loi
    (loi lfini ni R vt1 sup s)
    (println "Calcul termine avec succes avec Clojure.")
    ))

;; Enjoy!
;  java -jar {PATH}/loi132-0.1.0-SNAPSHOT-standalone.jar 1 0 1.2 88100.00 220212.20 100
