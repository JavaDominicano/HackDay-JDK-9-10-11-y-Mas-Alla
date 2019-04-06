#!/bin/bash


COM_GREETINGS_FOLDER="mods/com.greetings"
ORG_ASTRO_FOLDER="mods/org.astro"

echo "HackDay Java 9, 10, 11 y más"

echo ""
echo "*** Compilando contenido en modulo $ORG_ASTRO_FOLDER ***"
javac -d $ORG_ASTRO_FOLDER \
       src/org.astro/module-info.java \
       src/org.astro/org/astro/World.java



echo ""
echo "*** Compilando contenido en modulo '$COM_GREETINGS_FOLDER' y ensamblando con modulo '$ORG_ASTRO_FOLDER' ***"
javac --module-path mods \
      -d $COM_GREETINGS_FOLDER \
      src/com.greetings/module-info.java \
      src/com.greetings/com/greetings/Main.java



echo "================FIN=========="
