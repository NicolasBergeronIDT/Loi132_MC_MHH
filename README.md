# loi132
Projet Clojure pour calculer la compensation d'un MHH, tel que
spécifié dans le Projet de règlement sur la Loi sur la qualité de
l'environnement (chapitre Q-2) (Québec, CA).  Compensation pour
l'atteinte aux milieux humides et hydriques.

## Usage
Ajouter, à la suite les unes des autres, et séparées par un espace,
les valeurs initiales (var) suivantes pour le calcul de la
contribution avec le fichier compilé avec Leiningen "*standalone*jar"
dans le répertoire target.

var:
lfini
niR
vt1
sup
s

Sachant que:
lfini : État initial (LfINI)
ni : Impact de l'activité (NI)
R : Facteur de modulation régionale
vt1 : Valeur du terrain au compte de taxes ($)
sup : Superficie totale du terrain au compte de taxes (m2)
s : Superficie affectée (m2)

var:
lfini niR vt1 sup s

Sachant que:
lfini : État initial (LfINI)
ni : Impact de l'activité (NI)
R : Facteur de modulation régionale
vt1 : Valeur du terrain au compte de taxes ($)
sup : Superficie totale du terrain au compte de taxes (m2)
s : Superficie affectée (m2)

Il va de soi que vous devez ajuster ces valeurs pour chacun des cas de compensation.

ex. d'utilisation:
java -jar {PATH}/loi132-0.1.0-SNAPSHOT-standalone.jar lfini ni R vt1 sup s
java -jar {PATH}/loi132-0.1.0-SNAPSHOT-standalone.jar 1 0 1.2 88100.00 220212.20 100

## License
Nicolas Bergeron
bio., tech faune. ABQ 2550
Institut des territoires (OBNL)
nbergeron@idt.quebec

Distributed under the Eclipse Public License either version 1.0 or any
later version.

Copyright © 2018

NiX

Enjoy!
