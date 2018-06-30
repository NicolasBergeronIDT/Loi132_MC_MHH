REM Pour les utilisateurs de $windows$, voici un fichier bat pour vous
REM faciliter la vie. Desole aussi pour les accents mais $windows$
REM n'est pas UTF8.

REM Ce fichier doit etre dans le meme répertoire que le fichier standalone.jar avant son execution.

REM Au préalable, ajuster les valeurs pour chacun des cas
REM Changer les six parametres et double clique sur le fichier: mc.bat
REM La sortie sera écrite dans le fichier de sortie: outmc.txt
java -jar loi132-0.1.0-SNAPSHOT-standalone.jar 1 0 1.2 88100.00 220212.20 100 > outmc.txt
timeout 15

REM Institut des territoires (IDT)
