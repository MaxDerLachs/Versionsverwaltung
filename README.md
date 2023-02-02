# Versionsverwaltung

## Einfaches Werkzeug zur Versionsverwaltung

Erstellt werden soll eine einfache Anwendung mit den Möglichkeiten einer rudimentären Versionsverwaltung von Textdateien (oder Quelltexten):

- Speichern von Dateien in mehreren Versionen
- Holen einer Datei mit/ohne Sperren vom Server
- Upload einer vorhandenen Datei mit Freigabe der gehaltenen Sperre
- Einfügen von neuen Dateien
- Zugriffsmöglichkeit auf alte Versionen / Zurücksetzen auf alte Versionen
- Kennzeichnung mit Tags (z.B. „Version 1.0“)
- Möglichkeit des Vergleichs zwischen zwei Dateien (z.B. zwei verschiedenen Versionen)
- Zentrales Repository

Anwendung in Java erstellen (ggf. mit Weboberfläche) und alle Techniken aus der Vorlesung sollen angewandt werden.

## Voraussetzungen

- JDK 17: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
- IntelliJ / Eclipse IDE

## Technischer Aufbau

![image](https://user-images.githubusercontent.com/84570313/216387493-9aca8466-21ad-484b-8965-182bc5085406.png)

## Datenbank

MongoDB
