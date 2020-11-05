package Lession6_Funktionen

import Util.aufGanzeAbrunden
import Util.readDouble

// Hier kommt deine Funktion hin:


// Auf das grüne Dreieck drücken zum Ausführen
fun main() {
    val budget = readDouble("Wieviel Euro hast du im Geldbörserl?")
    val eintritt = readDouble("Wieviel Euro ist der Eintritt?")
    val bierPreis = readDouble("Wieviel Euro kostet Bier?")

    val bierAnzahl = 0.0 // Ersetze 0.0 durch deinen Funktionsaufruf.

    println("Juhu, du kannst dir ${bierAnzahl.aufGanzeAbrunden} Bier leisten, das wir eine tolle Nacht!")
}