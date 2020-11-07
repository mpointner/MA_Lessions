package Util

import java.lang.NumberFormatException
import kotlin.math.roundToInt

fun readString(aufforderung: String? = null): String {
    if (aufforderung != null) println(aufforderung)
    readLine()?.let {
        return it
    }
    return ""
}

fun readString(aufforderung: String? = null, gueltigeEingaben: List<String>): String {
    while (true) {
        if (aufforderung != null) println(aufforderung)
        readLine()?.let {
            if(gueltigeEingaben.contains(it)) {
                return it
            } else {
                println("Deine Eingabe ist ungültig, du musst einen der folgenden Werte eingeben: " + gueltigeEingaben.joinToString(", "))
            }
        }
    }
    return ""
}

fun readFloat(aufforderung: String? = null): Float {
    while (true) {
        if (aufforderung != null) println(aufforderung)
        readLine()?.let {
            try {
                return it.toFloat()
            } catch (e: NumberFormatException) {
                println("$it ist keine Float Zahl, bitte probier es noch einmal! Du darfst keine Buchstaben verwenden und musst ein Punkt statt Komma verwenden!")
            }
        }
    }
}

fun readDouble(aufforderung: String? = null): Double {
    while (true) {
        if (aufforderung != null) println(aufforderung)
        readLine()?.let {
            try {
                return it.toDouble()
            } catch (e: NumberFormatException) {
                println("$it ist keine Double Zahl, bitte probier es noch einmal! Du darfst keine Buchstaben verwenden und musst ein Punkt statt Komma verwenden!")
            }
        }
    }
}

fun readInt(aufforderung: String? = null): Int {
    while (true) {
        if (aufforderung != null) println(aufforderung)
        readLine()?.let {
            try {
                return it.toInt()
            } catch (e: NumberFormatException) {
                println("$it ist keine Int Zahl, bitte probier es noch einmal! Du darfst keine Buchstaben verwenden!")
            }
        }
    }
}

fun readLong(aufforderung: String? = null): Long {
    while (true) {
        if (aufforderung != null) println(aufforderung)
        readLine()?.let {
            try {
                return it.toLong()
            } catch (e: NumberFormatException) {
                println("$it ist keine Long Zahl, bitte probier es noch einmal! Du darfst keine Buchstaben verwenden!")
            }
        }
    }
}

val Double.formatiereDoublealsEuro: String get() =((this * 100).roundToInt() / 100.0).toString() + "€"

val Double.aufGanzeAbrunden: Int get() = this.toInt()

fun feuerwerk() {
    println("""
                                               .''.
           .''.      .        *''*    :_\/_:     .
          :_\/_:   _\(/_  .:.*_\/_*   : /\ :  .'.:.'.
      .''.: /\ :    /)\   ':'* /\ *  : '..'.  -=:o:=-
     :_\/_:'.:::.  | ' *''*    * '.\'/.'_\(/_'.':'.'
     : /\ : :::::  =  *_\/_*     -= o =- /)\    '  *
      '..'  ':::' === * /\ *     .'/.\'.  ' ._____
          *        |   *..*         :       |.   |' .---"|
            *      |     _           .--'|  ||   | _|    |
            *      |  .-'|       __  |   |  |    ||      |
         .-----.   |  |' |  ||  |  | |   |  |    ||      |
     ___'       ' /"\ |  '-."".    '-'   '-.'    '`      |____
    jgs~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      &                    ~-~-~-~-~-~-~-~-~-~   /|
     ejm97    )      ~-~-~-~-~-~-~-~  /|~       /_|\
            _-H-__  -~-~-~-~-~-~     /_|\    -~======-~
    ~-\XXXXXXXXXX/~     ~-~-~-~     /__|_\ ~-~-~-~
    ~-~-~-~-~-~    ~-~~-~-~-~-~    ========  ~-~-~-~
    """.trimIndent())
}