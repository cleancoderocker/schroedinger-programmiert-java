## JavaFX

### Installation

### Beispiel starten

```
export PATH_TO_FX=/Users/cleancoderocker/eclipse-workspace/schroedinger-programmiert-java/javafx-sdk-11.0.2/lib
```

```
javac -d bin --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml src/de/galileocomputing/schroedinger/java/kapitel16/javafx/schuhe/*.java
```

```
java -cp bin --module-path $PATH_TO_FX --add-modules javafx.controls de.galileocomputing.schroedinger.java.kapitel16.javafx.schuhe.SchuhKartonVolumenBerechnerGUI
```