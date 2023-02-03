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

- Frontend: Angular
- Backend: Java mit Spring Boot
- Apache Tomcat Webserver
- Datenbank: MongoDB Atlas

![image](https://user-images.githubusercontent.com/84570313/216387493-9aca8466-21ad-484b-8965-182bc5085406.png)

## Datenbankstruktur

### JSON/BSON Objekt für MongoDB

main object
- "repositoryVersion"
- files ARRAY
  - "ID"
  - "Name"
  - "Text"
- folders ARRAY
  - "ID"
  - "Name"
  - files ARRAY
  - folders ARRAY

![image](https://user-images.githubusercontent.com/84570313/216389601-63d740b8-aa4c-4375-b1d6-0f82b6b1e09d.png)

### Update - Überarbeitung Datenbankstruktur

FileObj
- fileID
- fileName
- fileText
- fileVersion
- fileParent
- fileEditor
- fileBlocked

FileObj.java class im Backend:

![image](https://user-images.githubusercontent.com/84570313/216528190-ee57a7c0-eb37-4b97-b4a1-79e564ff2f4e.png)

MongoDB document:

![image](https://user-images.githubusercontent.com/84570313/216528440-bacf2391-8864-4e1a-b11c-4c51fca4b3cd.png)
