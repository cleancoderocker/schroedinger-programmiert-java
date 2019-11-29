# Schrödinger programmiert Java

## Installation des Workspaces

Den gesamten Quelltext kannst Du Dir direkt als Eclipse-Projekt importieren. Wähle dazu in Eclipse im Hauptmenü den Eintrag "File —> Import...", um den Import-Dialog zu öfnnen. Wähle in diesem Dialog den Eintrag "General" und dann "Existing Projects into Workspace" und klicke auf "Next". Wähle dann das Verzeichnis aus, in dem der Ordner "SchroedingerProgrammiertJava" liegt (das Projekt sollte dann automatisch erkannt und im Bereich "Projects" ausgewählt sein) und bestätige mit "Finish".

Danach ist der Workspace einsatzbereit. Allerdings meckert der Compiler (der automatisch loslegt, die Java-Klassen im Eclipse-Projekt zu kompilieren) wegen einiger Kompilierungsfehler, die die XML-Beispiele und die JavaFX-Beispiele betreffen. Das liegt daran, dass die Bibliotheken, die für diese Beispiele notwendig sind, standardmäßig nicht mehr in der Java-Installation enthalten sind.

Wie Du die fehlenden Bibliotheken nachinstallierst, ist in den beiden folgenden Abschnitten beschrieben. Die müsstest Du also kurz durcharbeiten, wenn Du die XML-Beispiele und JavaFX-Beispiele ausführen möchtest. Alternativ kannst Du das natürlich auch zu einem späteren Zeitpunkt machen, denn alle anderen Beispiele funktionieren auch trotz dem meckernden Compiler.

## JAXB

Das Package `javax.xml.bind` ist mittlerweile nicht mehr in Java SE/EE enthalten, was dazu führt, dass einige Beispiele aus dem Schrödinger-Projekt nach der obigen Installation nicht direkt funktionieren. Beispielsweise lässt sich die Klasse `de.galileocomputing.schroedinger.java.kapitel14.pflanzen.JAXB` nicht ausführen bzw. es erscheint folgender Kompilierungsfehler:

```
Exception in thread "main" java.lang.Error: Unresolved compilation problems:
	JAXBContext cannot be resolved to a type
	JAXBContext cannot be resolved
	Marshaller cannot be resolved to a type
	Marshaller cannot be resolved to a variable
	No exception of type Object can be thrown; an exception type must be a subclass of Throwable
	JAXBException cannot be resolved to a type
	The method printStackTrace() is undefined for the type Object

	at de.galileocomputing.schroedinger.java.kapitel14.pflanzen.JAXB.main(JAXB.java:35)
```

Aber keine Panik! Das können wir schnell beheben. Das Einzige, was Du machen musst ist, die fehlenden JAR-Dateien von einem zentralen Repository herunterzuladen und dann manuell zum Build Path des Projekts hinzuzufügen.

Die JAR-Dateien findest Du hier:

* [jaxb-api](https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api/2.3.1)
* [jaxb-core](https://mvnrepository.com/artifact/com.sun.xml.bind/jaxb-core/2.3.0.1)
* [jaxb-impl](https://mvnrepository.com/artifact/com.sun.xml.bind/jaxb-impl/2.3.2)
* [javax.activation-api](https://mvnrepository.com/artifact/javax.activation/javax.activation-api/1.2.0)

Nachdem Du die Dateien erfolgreich heruntergeladen hast, musst Du sie nur noch dem Build Path hinzufügen. Klicke dazu in Eclipse im Package Explorer auf das Projekt "SchroedingerProgrammiertJava" und wähle aus dem Hauptmenü "File" und dann "Properties", um den Konfigurationsdialog für des Projekts aufzurufen. Wähle in diesem Dialog dann den Eintrag "Java Build Path" und füge über "Add External JARs..." die oben genannten JAR-Dateien zu dem Projekt hinzu. Bestätige dass Ganze mit "Apply and Close" und schon sollte Java keine Kompilierungsfehler mehr melden.

## JavaFX

### Installation

Um JavaFX zu installieren, folge den Anweisungen unter [https://openjfx.io/openjfx-docs/](https://openjfx.io/openjfx-docs/) und lade Dir die Version für Dein Betriebssystem herunter. Die jeweiligen ZIP-Dateien enthalten unter anderem die benötigten JAR-Dateien, die Du genau wie oben für JAXB beschrieben zum Build Path des Eclipse-Projekts hinzufügen musst, um den Compiler zu beruhigen.

### Beispiel starten

Leider funktkioniert der Aufruf der JavaFX-Beispiele aus Eclipser heraus nicht, sodass Du für das Starten der Beispiele auf die Kommandozeile zurückgreifen musst. Im Folgenden habe ich Dir kurz zusammengefasst, welche Schritte hierfür notwendig sind:

* Pfad zu JavaFX exportieren
  ```
  export PATH_TO_FX=/Users/cleancoderocker/eclipse-workspace/schroedinger-programmiert-java/javafx-sdk-11.0.2/lib
  ```
  (Linux/Mac)
  ```
  set PATH_TO_FX="/Users/cleancoderocker/eclipse-workspace/schroedinger-programmiert-java/javafx-sdk-11.0.2/lib"
  ```
  (Windows)

* JavaFX-Anwendung kompilieren
  ```
  javac \
    -d bin \
    --module-path $PATH_TO_FX \
    --add-modules javafx.controls,javafx.fxml \
    src/de/galileocomputing/schroedinger/java/kapitel16/javafx/schuhe/*.java
  ```
  (Linux/Mac)
  ```
  javac \
    -d bin \
    --module-path %PATH_TO_FX% \
    --add-modules javafx.controls,javafx.fxml \
    src/de/galileocomputing/schroedinger/java/kapitel16/javafx/schuhe/*.java
  ```
  (Windows)

* JavaFX-Anwendung ausführen
  ```
  java \
    -cp bin \
    --module-path $PATH_TO_FX \
    --add-modules javafx.controls \
    de.galileocomputing.schroedinger.java.kapitel16.javafx.schuhe.SchuhKartonVolumenBerechnerGUI
  ```
  (Linux/Mac)
  ```
  java \
    -cp bin \
    --module-path %PATH_TO_FX% \
    --add-modules javafx.controls \
    de.galileocomputing.schroedinger.java.kapitel16.javafx.schuhe.SchuhKartonVolumenBerechnerGUI
  ```
  (Windows)
