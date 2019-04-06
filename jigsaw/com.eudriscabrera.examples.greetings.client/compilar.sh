#!/bin/bash

echo "HackDay Java 9, 10, 11 y más"

javac -d mods/greetingsclient src/com/eudriscabrera/examples/greetings/client/GreetingsClient.java src/module-info.java --module-source-path "../com.eudriscabrera.examples.greetings/src"  --module com.eudriscabrera.examples.greetings 

#descomentar para corregir error
#

echo "================FIN=========="
