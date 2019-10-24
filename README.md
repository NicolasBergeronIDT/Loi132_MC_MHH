# loi132
Compensation pour l'atteinte aux milieux humides et hydriques (MHH).

Projet Clojure pour calculer la compensation d'un MHH, soit le Montant contribution exigible (MC) ($), tel que spécifié dans le :

Règlement sur la compensation pour l’atteinte aux milieux humides et hydriques. Loi sur la qualité de l’environnement
(chapitre Q-2, a. 46.0.3, 46.0.5, 46.0.12 et 95.1).

[Q-2, r. 9.1 - Règlement sur la compensation pour l’atteinte aux milieux humides et hydriques](http://legisquebec.gouv.qc.ca/fr/ShowDoc/cr/Q-2,%20r.%209.1/)

# Au préalable
Il va de soi que Java sera nécessaire mais toutes les dépendances sont résolues au départ. Minimalement ce que vous devez avoir est Java Runtime Environment (JRE). De nos jours, vous avez très certainements Java déjà installé sur votre ordinateur.

Pour plus d'info concernant la version de Java sur votre ordinateur:

[Java](https://www.java.com/fr/download/installed.jsp)

# Usage

télécharger depuis le répertoire /target le fichier compilé :

"loi132-0.1.0-SNAPSHOT-standalone.jar"

Ajouter, à la suite les unes des autres, et séparées par un espace,
les valeurs initiales (var) suivantes pour le calcul de la
MC; avec le fichier compilé "loi132-0.1.0-SNAPSHOT-standalone.jar", avec comme paramètres les variables suivantes:

var
* lfini
* ni
* R
* vt1
* sup
* s

Sachant que:

* lfini : État initial (LfINI). Le   facteur représentant l’état initial du   milieu    humide « Lf INI ». Ce facteur correspond à la composante du milieu qui est la plus dégradée, soit la valeur minimale entre les trois composantes: Végétation, Sol et Eau (min Veg_LfINI Sol_LfINI Eau_LfINI)
* ni : Impact de l'activité (NI). Ce  facteur est  celui  qui correspond à la composante du milieu pour laquelle l’impact est le plus important, soit la valeur minimale entre les trois composantes: Végétation, Sol et Eau (min Veg_NI Sol_NI Eau_NI)
* R : Facteur de modulation régionale par MRC
* vt1 : Valeur du terrain au compte de taxes ($)
* sup : Superficie totale du terrain au compte de taxes (m2)
* s : Superficie affectée par la zone des travaux (m2)

Il va de soi que vous devez ajuster ces valeurs pour chacun des cas de compensation des MHH.

Exemple d'utilisation:

Commande avec les paramètres
* `java -jar {PATH}/loi132-0.1.0-SNAPSHOT-standalone.jar lfini ni R vt1 sup s`

Même commande mais cette fois-ci avec les "var"
* `java -jar {PATH}/loi132-0.1.0-SNAPSHOT-standalone.jar 1 0 1.2 88100.00 220212.20 100`

# $windows$
Pour vous simplier la vie ... utiliser le fichier: mc.bat

# License
Nicolas Bergeron

bio., tech faune. ABQ 2550

Institut des territoires (OBNL)

nbergeron@idt.quebec

Distributed under the Eclipse Public License either version 1.0 or any
later version.

Copyright © 2018

NiX

Enjoy!
