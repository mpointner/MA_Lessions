Klicke rechts oben auf ![](../../../../images/LayoutPreviewOnly.png) um nur die erzeugte Version dieser Anleitung zu sehen.

# Wiederholungen

Oft ist es beim Programmieren notwendig etwas zu wiederholen.
Zum Beispiel ein Zähler von 1 bis 100 ist ohne Wiederholung sehr mühsam:

```kotlin
println(1)
println(2)
println(3)
...
println(99)
println(100)
```

Deswegen schau wir uns jetzt an wie man Code wiederholen kann.
In der Informatik sagt man zu einem Wiederholung-Block "Schleife".

## While: Wiederhole solange zutrifft

```kotlin
while (solange_dies_zutrifft) {
    // Wird wiederholt solange Bedingung 
}
```

Als abstraktes Beispiel:
```kotlin
while (solange_Blinker_gesetzt) {
    Blinkerlechte_blickt
    Blinker_Ton_Tick_Tack
}
```
In diesem Beispiel würde der Inhalt (Blinkerlechte_blickt und Blinker_Ton_Tick_Tack) der While-Wiederholung nur dann und 
solange die Bedingung (solange_Blinker_gesetzt) zutrifft wiederholt ausgeführt werden.
Hierbei muss man aufpassen, dass die Bedingung auch irgendwann mal nicht mehr erfüllt wird, 
damit auch irgendwann Code nach der While-Schleife ausgeführt werden kann.
<!--
In dem vorherigen Beispiel muss die Bedingung erfüllt sein, damit der Inhalt der `while`-Schleife wiederholt ausgeführt wird.
Es gibt jedoch auch die `do while`-Schleife, wo die Bedingung am Ende ist und damit der Inhalt mindestens einmal ausgeführt wird:

```kotlin
do { // Zumindest ein Durchlauf
    
} while (solangeDiesZutrift)
```
-->
## For: Für Abfolgen und Listen

Zurückkommend auf das Beispiel zu Beginn der Seite ... 
Für Abfolgen, wo man einen Zähler braucht, eignet sich noch besser als die `while`-Schleife die `for` Schleife.
Die Syntax der Bedingung der `for`-Schleife besteht aus zwei Teilen getrennt durch ein `in`: 
* Variablenname (erhält immer den aktuellen Wert des Schleifendurchlaufes)
* Abfolge/Liste mit den durchlaufenen Werten, z.B. 1 bis 9 (geschrieben als `1..9`)

### ..-Abfolge

Für aufsteigende Aufzählungen eignet sich die `..`-Abfolge mit folgender Syntax: `start..ende` (start und ende inklusive):
```kotlin
for (i in 1..9) { // inklusive 9
    print("$i ")
}
```
```
1 2 3 4 5 6 7 8 9 
```

### until-Abfolge

Wenn das Ende exkludiert werden soll, kann man entweder `start..(ende-1)` oder `start until ende` (ende exklusive) verwenden:
```kotlin
for (i in 1 until 10) { // ohne 10 (gleich wie 1..9)
    print("$i ")
}
```
```
1 2 3 4 5 6 7 8 9 
```

### downTo-Abfolge

Absteigende Folgen kann man mit `downTo` realisieren.
Mit `step` kann man die Schrittweite verändern (kann auch mit `..` oder `until` kombiniert werden).
```kotlin
for (i in 9 downTo 1 step 2) { // von 9 nach 1 runter mit 2-Schrittweit: 
    print("$i ")
}
```
```
9 7 5 3 1 
```

### Listen

Für noch komplexere Abfolgen muss man eine Liste erstellen:
```kotlin
val list = listOf(1, 7, 4)
for (element in list) {
    print("$element ")
}
```
```
1 7 4 
```

oder mit den Iterationwerten rechnen:
```kotlin
for (i in 1 until 5) { // ohne 10 (gleich wie 1..9)
    val i_squared = i * i
    print("$i_squared ")
}
```
```
1 4 9 16 25
```

# Aufgaben

## 1x1
Stelle dir vor du hättest in der Volkschule schon programmieren können, 
wie leicht wäre dann das Aufschreiben der 1x1 Tabelle gewesen.
Genau das sollst du jetzt machen: Schreibe ein Programm, dass die 1x1-Matrix ausgibt:
```
1 2 3 4 5 6 7 8 9 
2 4 6 8 10 12 14 16 18 
3 6 9 12 15 18 21 24 27 
4 8 12 16 20 24 28 32 36 
5 10 15 20 25 30 35 40 45 
6 12 18 24 30 36 42 48 54 
7 14 21 28 35 42 49 56 63 
8 16 24 32 40 48 56 64 72 
9 18 27 36 45 54 63 72 81 
```
Tipp: Verschachtle zwei Schleifen wie eine russische Babuschka und rechne dir die Multiplikation aus beiden Laufvariablen in einer eigenen Variable aus.

![](../../../../images/Babuschka.jpg)

## Happy New Year Countdown
Schreibe einen Countdown für nächstes Silvester.
Der Countdown soll von `10` nach `1` runderzählen und nach jeder Zahl 1 Sekunde (=1000ms) warten.
Verwendet dazu den Befehl `Thread.sleep(1000)`.
Gib am Ende einen Neu-Jahrs-Spruch aus und schieß ein Feuerwerk in den Himmel über Wien.
Du kannst das machen, indem du den Befehl `Util.feuerwerk()` verwendest.
