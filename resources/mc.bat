REM Ajouter, � la suite les unes des autres, et s�par�es par un espace,
REM les valeurs initiale suivantes pour le calcul de la contribution:
REM lfini ni R vt1 sup s

REM Sachant que:
REM �tat initial (LfINI): lfini
REM Impact de l'activit� (NI): ni
REM Facteur de modulation r�gionale : R
REM Valeur du terrain au compte de taxes ($): vt1
REM Superficie totale du terrain au compte de taxes (m2): sup
REM Superficie affect�e (m2) : s

REM Ajuster ces valeurs pour chacun des cas.

REM ex. Utilisation: java -jar {PATH}/loi132-0.1.0-SNAPSHOT-standalone.jar lfini ni R vt1 sup s
REM ex. Utilisation: java -jar {PATH}/loi132-0.1.0-SNAPSHOT-standalone.jar 1 0 1.2 88100.00 220212.20 100

REM Changer les six param�tres et double-click sur le fichier .bat
java -jar loi132-0.1.0-SNAPSHOT-standalone.jar 1 0 1.2 88100.00 220212.20 100
timeout 25

REM Institut des territoires (IDT)
