Klicke rechts oben auf ![](../../../../images/LayoutPreviewOnly.png) um nur die erzeugte Version dieser Anleitung zu sehen.

# Verzweigungen

![](../../../../images/Verzweigung.jpg)

Mit `if` (und optional als zweiten Ast `else`) kann man Verzweigungen programmieren.
Das ist wie, wenn du bei einem Weg vor einer Kreuzung steht und dich abhängig von dem Wegweiser für den rechten oder den linken Weg entscheiden musst.
Beim Kotlin funktioniert das wie folgt:

`if (`Bedingung`) {`Bedingung-Wahr-Pfad`} else {`Bedingung-Falsch-Pfad`}`

Nimm an du bis auf der Autobahn vor einer Ausfahrt und das Schild zeigt "Linz" an. Abhängig davon, ob dein Ziel Linz ist, würdest du jetzt abfahren, sonst gerade weiterfahren:

`if (ausfahrt == "Linz") { abfahren } else { weiterfahren }`

Beachte die runden Klammern `()` um die Bedingung, die geschwungenen Klammern `{}` und die Pfade und das doppelte Gleichheitszeichen `==` zum Vergleichen.

## Vergleichs-Operatoren

Für die Bedingung gibt es noch weitere Vergleichsoperatoren:

* `==` gleich, z.B.: `if (x == y) { ... }`
* `!=` ungleich, z.B.: `if (x != y) { ... }`
* `>` größer, z.B.: `if (x > y) { ... }`
* `>=` größer gleich, z.B.: `if (x >= y) { ... }`
* `<` kleiner, z.B.: `if (x < y) { ... }`
* `<=` kleiner gleich, z.B.: `if (x <= y) { ... }`

Hier ein Beispiel dazu:

```kotlin
println("Gibt deinen Schularbeitsnote ein:")
var note = readLine()?.toInt()

if (note <= 4) {
    println("Bestanden")
} else {
    println("Nicht bestanden")
}
```

## Logische Operatoren

Man kann mehrere Vergleiche auch kombinieren:

```kotlin
if (temperatur >= 25 && temperatur <= 35) {
    println("Angenehme Temperatur zum Baden")
} else {
    println("Ich bleib lieber drinnen, mir ist es zu kalt/heiß")
}
```

Hier wurde der UND-Operator `&&` (doppeltes Kaufmanns-Und) verwendet.
Es gibt auch den ODER-Operation `||` (doppelter Strich `alt gr+<` / `Option+7`).

## Tipps und Tricks

```kotlin
var a: Int = 3
var b: Int = 2
var max = 0
if (a > b) {
    max = a
} else {
    max = b
}
println(max)
```

Wenn in beiden Pfaden die gleiche Variable (in dem Fall `max`) zugewiesen wird, 
kann man dies auch und spart sich damit den komische Startwert (und kann `var` statt `var` verwenden):

```kotlin
var a: Int = 3
var b: Int = 2
var max = if (a > b) {
    a
} else {
    b
}
println(max)
```

Wenn in der geschwungenen Klammer nur ein Befehl/Variable steht, kann man die Klammern auch weglassen. 
Zeilenumbrüche sind auch optional:

```kotlin
var a: Int = 3
var b: Int = 2
var max = if (a > b) a else b
println(max)
```

# Aufgaben

## Passwort

![](../../../../images/Passwort.jpg)

Schreibe ein Programm, dass eine Passworteingabe überprüft. Verwende zum Einlese `var eingabe = readString()`.
Wenn das Passwort mit `"geheim"` übereinstimmt, dann soll "Eingeloggt" ausgegeben werden, sonst "Falsches Passwort".

## Schere-Stein-Papier

![](../../../../images/SchereSteinPapier.jpg)

Vervollständige das Schere-Stein-Papier Beispiel.
Zur Erleichterung sind die Werte `Schere`,`Stein`,`Papier` bereits in Variablen abgespeichert, also kannst du z.B. `ich` und `schere` auf Gleichheit überprüfen.

Beachte folgende Fälle:

|*Ich* (Zeile), *Computer* (Spalte)|    *Schere*   |    *Stein*    |    *Papier*   |
|:------------------:|:-------------:|:-------------:|:-------------:|
|      *Schere*       | Unentschieden |    Verloren   |    Gewonnen   |
|       *Stein*      |    Gewonnen   | Unentschieden |    Verloren   |
|      *Papier*      |    Verloren   |    Gewonnen   | Unentschieden |

Gewonnen, wenn:

|*Ich* |*Computer*|
|:----:|:--------:|
|Schere|Papier    |
|Stein |Schere    |
|Papier|Stein     |

Verloren, wenn:

|*Ich* |*Computer*|
|:----:|:--------:|
|Schere|Stein     |
|Stein |Papier    |
|Papier|Schere    |

Unentschieden, wenn:

|*Ich* |*Computer*|
|:----:|:--------:|
|Schere|Schere    |
|Stein |Stein     |
|Papier|Papier    |

**Tipps / mögliche Lösungswege**
* Verschachtle if-else, indem du im äußeren `if (...) { ... } else if (...) { ... } else { ... }` nach deiner Eingabe prüfst und dann jeweils eine Verschachtelung tiefer nach der Eingabe des Computers.
* Verknüpfe die Eingaben-Kombinationen von dir und dem Computer, indem du gewinnst mit einem logischen UND sowie die einzelnen Gewinnsituationen mit einem logischen ODER.
* Vergiss nicht auf die "Unentschieden"-Situation. Diese kannst du ganz einfach prüfen, indem du die beiden Variablen `ich` und `computer` auf Gleichheit prüfst.


<!--
## Größte Person

![](../../../../images/Personen.jpg)

Schreibe ein Programm, dass überprüft, wer von dir und deinen beiden besten Freunden / Sitznachbarn am Größten ist.
Ändere dazu die Variablennamen/Aufforderung in `GroesstePerson.kt` auf die Namen deiner Freunde/Sitznachbarn und 
überprüfe mit `if` `else` wer von euch am Größten ist.
Beachte, dass du `if` `else` auch verschachteln oder verketten kannst, z.B.:
```kotlin
if (...) { // Bedingung 1
    // Block wird ausgeführt, falls Bedingung 1 zutrifft
    if (...) { // Bedingung 2
        // Block wird ausgeführt, falls auch Bedingung 2 zutrifft
    } else {
        // Block wird ausgeführt, falls Bedingung 2 NICHT zutrifft
    }
} else {
    // Block wird ausgeführt, falls Bedingung 1 NICHT zutrifft
    if (...) { // Bedingung 3
        // Block wird ausgeführt, falls Bedingung 3 zutrifft
    } else {
        // Block wird ausgeführt, falls Bedingung 3 NICHT zutrifft
    }
}
```

oder:
```kotlin
if (...) { // Bedingung 1
    // Block wird ausgeführt, falls Bedingung 1 zutrifft
} else if (...) { // Bedingung 2
    // Block wird ausgeführt, falls Bedingung 1 NICHT zutrifft, aber Bedingung 2
} else {
    // Block wird ausgeführt, falls weder Bedingung 1 noch Bedingung 2 zutrifft
}
```
-->



