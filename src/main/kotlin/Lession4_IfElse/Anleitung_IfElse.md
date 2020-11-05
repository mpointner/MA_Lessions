Klicke rechts oben auf ![](../../../../images/LayoutPreviewOnly.png) um nur die erzeugte Version dieser Anleitung zu sehen.

# Verzweigungen

![](../../../../images/Verzweigung.jpg)

Mit `if` (und optional als zweiten Ast `else`) kann man Verweigungen programmieren.
Das ist wie wenn du bei einem Weg vor einer Kreuzung steht und dich abhängig von dem Wegweiser für den rechten oder den linken Weg entscheiden musst.
Beim Kotlin funktioniert das wie folgt:

`if (`Bedingung`) {`Bedingung-Wahr-Pfad`} else {`Bedingung-Falsch-Pfad`}`

Nimm an du bis auf der Autobahn vor einer Ausfahrt und das Schild zeigt "Linz" an. Abhängig davon ob dein Ziel Linz ist, würdest du jetzt abfahren, sonst gerade weiterfahren:

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

Man kann Vergleiche auch kombinieren:

```kotlin
if (temperatur >= 25 && temperatur <= 35) {
    println("Angenehme Temperatur zum Baden")
} else {
    println("Ich bleib lieber drinnen")
}
```

Hier wurde der UND-Operator `&&` (doppeltes Kaufmanns-Und) verwendet.
Es gibt auch den ODER-Operation `||` (doppelter Strich).

## Tipps und Tricks

```kotlin
val a: Int = 3
val b: Int = 2
var max = -100000 // Irgendein Wert, wird eh im if-else geändert
if (a > b) {
    max = a
} else {
    max = b
}
println(max)
```

Wenn in beiden Pfaden die gleiche Variable (in dem Fall `max`) zugewiesen wird, 
kann man dies auch und spart sich damit den komische Initialwert (und kann `val` statt `var` verwenden):

```kotlin
val a: Int = 3
val b: Int = 2
val max = if (a > b) {
    a
} else {
    b
}
println(max)
```

Wenn in der geschungenen Klammer nur ein Befehl/Variable steht, kann man die Kammern auch weglassen. 
Zeilenumbrüche sind auch optional:

```kotlin
val a: Int = 3
val b: Int = 2
val max = if (a > b) a else b
println(max)
```

# Aufgaben

## Passwort

![](../../../../images/Passwort.jpg)

Schreibe ein Programm, dass eine Passworteingabe überprüft. Verwende zum Einlese `val eingabe = Util.readString()`.
Wenn das Passwort mit "geheim" übereinstimmt, dann soll "Eingeloggt" ausgegeben werden, sonst "Falsche Passwort".

## Größte Person

![](../../../../images/Personen.jpg)

Schreibe ein Programm, dass überprüft wer von dir und deinen beiden besten Freunden / Sitznachbarn am Größten ist.
Ändere dazu die Variablennamen in `GroesstePerson.kt` auf die Namen deiner Freunde/Sitznachbarn und 
überprüfe mit `if` `else` wer von euch am Größten ist.
Beachte dass du `if` `else` auch verschachteln oder verketten kannst, z.B.:
```kotlin
if (...) { // Bedingung 1
    // Block wird ausgeführt falls Bedingung 1 zutrifft
    if (...) { // Bedingung 2
        // Block wird ausgeführt falls auch Bedingung 2 zutrifft
    } else {
        // Block wird ausgeführt falls Bedingung 2 NICHT zutrifft
    }
} else {
    // Block wird ausgeführt falls Bedingung 1 NICHT zutrifft
    if (...) { // Bedingung 3
        // Block wird ausgeführt falls Bedingung 3 zutrifft
    } else {
        // Block wird ausgeführt falls Bedingung 3 NICHT zutrifft
    }
}
```

oder:
```kotlin
if (...) { // Bedingung 1
    // Block wird ausgeführt falls Bedingung 1 zutrifft
} else if (...) { // Bedingung 2
    // Block wird ausgeführt falls Bedingung 1 NICHT zutrifft, aber Bedingung 2
} else {
    // Block wird ausgeführt falls weder Bedingung 1 noch Bedingung 2 zutrifft
}
```



