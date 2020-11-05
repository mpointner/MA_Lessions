package Util

import java.lang.NumberFormatException
import kotlin.math.roundToInt

fun readString(text: String? = null): String {
    if (text != null) println(text)
    readLine()?.let {
        return it
    }
    return ""
}

fun readFloat(text: String? = null): Float {
    while (true) {
        if (text != null) println(text)
        readLine()?.let {
            try {
                return it.toFloat()
            } catch (e: NumberFormatException) {
                println("$it is not a valid Float number, please try again! You may not use letters and have to use . instead of , for the comma!")
            }
        }
    }
}

fun readDouble(text: String? = null): Double {
    while (true) {
        if (text != null) println(text)
        readLine()?.let {
            try {
                return it.toDouble()
            } catch (e: NumberFormatException) {
                println("$it is not a valid Double number, please try again! You may not use letters and have to use . instead of , for the comma!")
            }
        }
    }
}

fun readInt(text: String? = null): Int {
    while (true) {
        if (text != null) println(text)
        readLine()?.let {
            try {
                return it.toInt()
            } catch (e: NumberFormatException) {
                println("$it is not a valid Int number, please try again!")
            }
        }
    }
}

fun readLong(text: String? = null): Long {
    while (true) {
        if (text != null) println(text)
        readLine()?.let {
            try {
                return it.toLong()
            } catch (e: NumberFormatException) {
                println("$it is not a valid Long number, please try again!")
            }
        }
    }
}

val Double.Euro: String get() =((this * 100).roundToInt() / 100.0).toString() + "€"

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