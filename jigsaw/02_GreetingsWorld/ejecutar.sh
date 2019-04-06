#!/bin/bash

echo "HackDay Java 9, 10, 11 y más"

echo ""
echo "*** Ejecutando 'com.greetings.Main' desde el directorio 'mods'  (module 'com.greetings' que depende de 'org.astro') *** "


java --module-path mods \
     --module com.greetings/com.greetings.Main


