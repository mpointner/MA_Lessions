package lession6_Funktionen

import util.*

// Hier kommt deine Funktion hin:


// Auf das grüne Dreieck drücken zum Ausführen
fun main() {
    var budget: Double = readDouble("Wieviel Euro hast du im Geldbörserl?")
    var eintritt: Double = readDouble("Wieviel Euro ist der Eintritt?")
    var getraenkPreis: Double = readDouble("Wieviel Euro kostet Bier?")

    var getraenkAnzahl = 0.0 // Ersetze 0.0 durch deinen Funktionsaufruf.

    println("Juhu, du kannst dir ${getraenkAnzahl.aufGanzeAbrunden()} Bier leisten, das wir eine tolle Nacht!")
}