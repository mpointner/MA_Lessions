package Lession4_IfElse

import Util.*
import kotlin.random.Random

fun main() {
    val schere: String = "Schere"
    val stein: String = "Stein"
    val papier: String = "Papier"

    val gueltigeEingaben = listOf(schere, stein, papier)

    val computer = gueltigeEingaben[Random.nextInt(0, 3)] // Wählt zufällt Schere, Stein oder Papier aus (den Code musst du nicht verstehen)
    val ich = readString("Deine Wahl eingeben (Schere, Stein, Papier):", gueltigeEingaben)

    println("Du hast $ich gewählt, Computer hat $computer gewählt!")
    // Ab hier fehlt noch dein Code

}