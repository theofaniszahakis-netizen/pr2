# Lehrplan: 90‑minütiger seminaristischer Unterricht (SU 1 von 2)
**Fach:** Programmierung 2 mit Java – Einstieg in JavaFX anhand eines Calculator‑Beispiels  

---

## 1. Rahmenbedingungen und Annahmen

- Es sind **zwei SU‑Einheiten zu je 90 Minuten** zu JavaFX geplant; dieser Plan beschreibt **SU 1 (Grundlagen + primitiver Calculator ohne komplexe Architektur)**.  
- In **SU 1 + Übung 1** entsteht ein **primitiver Calculator** mit zwei Eingabefeldern für Zahlen, einem Operator, einem „Berechnen“‑Button und einem Ausgabe‑Label; in der **Übung 1** erweitern die Studierenden diesen um **weitere Operatoren, zusätzliche Fehlerbehandlung und eine Historie‑Liste (ListView)**.  
- In **SU 2 + Übung 2** (separater Plan) wird ein **komplexerer Calculator mit Ganzzahlen** auf Basis von **FXML und MVP‑Pattern** entwickelt; in der Übung 2 vervollständigen die Studierenden einen unvollständigen Calculator (fehlende UI‑Elemente, fehlende Logik).  
- Zielgruppe: 2. Semester, solide OOP‑Grundlagen, noch keine JavaFX‑Erfahrung, ca. 40 Studierende im Hörsaal, alle mit Laptop.  
- Inhalte SU 1: Grundlagen JavaFX (Stage, Scene, Layouts, Controls) + Event‑Handling, Fokus auf konkrete APIs, nicht auf abstrakte Architekturkonzepte.  
- Beispielprojekt SU 1: primitiver Calculator als Start, der in Übung 1 zum oben beschriebenen Funktionsumfang (zweimal Zahl, Operator, Berechnen‑Button, Ausgabe‑Label, später Historie‑ListView) ausgebaut wird.  
- Unterrichtsform: seminaristisch mit deutlichem Lehrinput (ca. 60 %), kurze Aktivierungsfragen, zwei 5‑Min‑Mini‑Coding‑Phasen in Einzelarbeit.  
- Materialien: Folien auf Basis von `06-vorlesung.pdf`, `GUIs mit JavaFX (Teil 1).pdf`, `GUIs mit JavaFX (Teil 2).pdf` und den Unterpaketen in `lession08/src/main/java/de/bht/pr2/lession08`, bei Bedarf um kleine Beispiele ergänzt.  

---

## 2. Lernziele

### 2.1 Fachliche Lernziele SU 1

- Studierende können den grundlegenden Aufbau einer JavaFX‑Applikation beschreiben (Application, Stage, Scene, Scenegraph, Layout‑Pane).  
- Studierende können einfache Oberflächen mit Standard‑Controls (Label, TextField, Button) und geeigneten Layouts erstellen und anpassen.  
- Studierende verstehen das Grundprinzip des Event‑Handlings in JavaFX (Eventquelle, Listener/EventHandler, Lambda in `setOnAction`) und können es im primitiven Calculator anwenden.  
- Studierende können einen bestehenden primitiven JavaFX‑Calculator um einfache Layout‑ und Event‑Änderungen erweitern und sind auf Übung 1 vorbereitet (Operatoren, Fehlerfälle, Historie‑ListView).  

### 2.2 Überfachliche Lernziele

- Studierende reflektieren kurz grundlegende Usability‑Aspekte eines einfachen GUIs (Lesbarkeit, Anordnung, Eindeutigkeit von Buttons).  
- Studierende üben das eigenständige Lesen und Verstehen von fremdem Code in einem überschaubaren Beispielprojekt.  

### 2.3 Ausblick auf Lernziele SU 2 (nur ankündigen)

- Studierende können in SU 2 komplexere Layouts (verschachtelte Container) erstellen und eine **Historie der Berechnungen in einer Tabelle** unter dem Formular darstellen.  
- Studierende erhalten einen ersten Einblick in **CSS‑Styling für JavaFX** und in **MVC/MVP‑Architekturen** am komplexeren Calculator mit Ganzzahlen.  

---

## 3. Zeitlicher Ablauf SU 1 (90 Minuten Gesamt)

### Übersicht

1. 0–10 min: Einstieg, Motivation, Lernziele, Vorwissen aktivieren  
2. 10–25 min: Grundlagen JavaFX – Konzepte und erstes minimales Beispiel  
3. 25–35 min: Vorstellung des primitiven Calculator‑Projekts und Live‑Demo  
4. 35–40 min: Mini‑Coding‑Aufgabe 1 (Layout‑Änderung beim primitiven Calculator)  
5. 40–47 min: Besprechung Mini‑Aufgabe 1 und Übergang zu Event‑Handling  
6. 47–60 min: Event‑Handling in JavaFX am primitiven Calculator zeigen  
7. 60–65 min: Mini‑Coding‑Aufgabe 2 (Event‑Verhalten/Fehlerbehandlung)  
8. 65–70 min: Kurze Besprechung Mini‑Aufgabe 2  
9. 70–82 min: Ausblick auf den Zielzustand von SU 1 + Übung 1 sowie Brücke zu SU 2 / Übung 2  
10. 82–90 min: Zusammenfassung, Lernziel‑Check, Ausblick auf SU 2  

---

## 4. Phase 1: Einstieg und Motivation (0–10 min)

### Ziele der Phase

- Kontext der beiden JavaFX‑Sitzungen im Modul „Programmierung 2 mit Java“ klären.  
- Interesse durch konkretes Beispiel (Calculator) wecken.  
- Vorwissen zu GUIs allgemein aktivieren.  

### Ablauf

1. **Begrüßung und Einordnung (ca. 3 min)**  
   - Kurze Erinnerung: bisher v. a. Konsolenprogramme, nun Schritt Richtung grafische Oberflächen.  
   - Auf der Folie: Überblicks‑Slide aus `06-vorlesung.pdf` bzw. JavaFX‑Einordnung (Client‑GUI in Java).  

2. **Motivation über Alltagsbeispiel (ca. 3 min)**  
   - Frage ans Plenum: „Welche GUIs nutzt ihr täglich, die mehr sind als nur einfache Eingabemasken, und was nervt euch daran?”  
   - Überleitung: Einfache, aber typische GUI‑Aufgabe heute – ein Taschenrechner, der in **SU 1 + Übung 1** vom sehr einfachen Prototyp zum brauchbaren primitiven Calculator ausgebaut wird.  

3. **Lernziele und Zweiteilung transparent machen (ca. 4 min)**  
   - Folie mit 3–4 klar formulierten Lernzielen für **SU 1** (vgl. Abschnitt 2.1) und kurzem Ausblick auf SU 2 (vgl. 2.3).  
   - Betonung: heute Fokus auf Grundlagen JavaFX + Events am primitiven Calculator; nächste Woche komplexere Layouts, CSS und MVP für den komplexeren Ganzzahlen‑Calculator.  

---

## 5. Phase 2: Grundlagen JavaFX – Konzepte und minimales Beispiel (10–25 min)

### Ziele der Phase

- Grundbegriffe von JavaFX einführen.  
- Minimales Beispiel als Referenz für spätere Erweiterungen schaffen.  

### Inhaltliche Leitstruktur (für Folien, ggf. aus PDF Teil 1 übernehmen)

- JavaFX‑Anwendung: Rolle der Klasse `Application`, `start(Stage primaryStage)`.  
- `Stage`, `Scene`, Scenegraph‑Idee (hier nur anschaulich, keine Tiefentheorie).  
- Einfache Layouts: z. B. `VBox`, `HBox`, `GridPane`.  
- Basis‑Controls: `Label`, `TextField`, `Button`.  

### Ablauf

1. **Erklärung der Grundstruktur (ca. 7–8 min)**  
   - Folien mit vereinfachten Klassendiagrammen / Ablauf (teils aus `GUIs mit JavaFX (Teil 1).pdf`).  
   - Kurzer, kommentierter Code‑Ausschnitt eines „Hello‑Label‑Fensters“ zeigen.  

2. **Live‑Coding oder Code‑Walkthrough eines Minimalbeispiels (ca. 7–8 min)**  
   - Start von einem sehr einfachen Projekt (z. B. Package `e01_hello_javafx` oder ähnlich aus den Unterpaketen, oder ein analoges Beispiel).  
   - Zeigen, wie Stage, Scene, Layout‑Pane und 1–2 Controls zusammenspielen.  
   - Kurze, gezielte Fragen: „Wo würden wir ein weiteres Control hinzufügen?”, „Wo legen wir das Layout fest?”.  

---

## 6. Phase 3: Primitiver Calculator – Einführung und Demo (25–35 min)

### Ziele der Phase

- Studierende lernen das **primitiv gehaltene Calculator‑Projekt** kennen, das in SU 1 + Übung 1 zum Zielzustand (zwei Zahlen, Operator, Berechnen‑Button, Ausgabe‑Label, Historie‑ListView) ausgebaut wird.  
- Studierende verstehen, wie das bisher Gelernte (Layouts, Controls) im primitiven Calculator genutzt wird.  

### Ausgangspunkt

- Projekt mit einem primitiven Calculator vorbereiten (an `e06_calculator` angelehnt, aber bewusst stark vereinfacht):  
  - z. B. zwei Textfelder für Zahlen und zunächst ein `+`‑Button (oder ein „Berechnen“‑Button mit fest hinterlegter Addition).  
  - Anzeige des Ergebnisses in einem Label.  

### Ablauf

1. **Struktur des Projekts erklären (ca. 5 min)**  
   - Folie oder IDE‑Ansicht mit Package‑Struktur, z. B. `de.bht.pr2.lession08.e06_calculator` und ggf. Unterpakete.  
   - Kurz erläutern, wo die GUI‑Klasse liegt, wo (später) Logik liegen kann.  

2. **Live‑Demo des primitiven Calculators (ca. 5 min)**  
   - Anwendung starten, typische Nutzungssequenz zeigen.  
   - Studierende benennen lassen, welche GUI‑Elemente sie sehen (Buttons, TextFields, Label).  

3. **Kurzer Code‑Überblick (ca. 5 min)**  
   - Wichtige Stellen zeigen: Aufbau des Layouts, Erstellung der Controls, Verknüpfung mit Scene/Stage.  
   - Noch kein tiefes Eingehen auf Event‑Handling, nur kurz markieren, wo ein `setOnAction` stehen wird.  

---

## 7. Phase 4: Mini‑Coding‑Aufgabe 1 – Layout‑Änderung am primitiven Calculator (35–40 min)

### Ziele der Phase

- Erste eigenständige Veränderung am GUI‑Layout im bestehenden **primitiven** Calculator‑Code.  
- Sicherheit im Umgang mit Layouts und Controls gewinnen, ohne gleich zum vollständigen Zielzustand zu springen.  

### Aufgabenstellung (ca. 5 min Einzelarbeit)

- Studierende arbeiten im vorhandenen primitiven Calculator‑Projekt (IntelliJ + Maven, JDK 17+).  
- Beispielaufgaben (eine auswählen oder als gestufte Aufgabe formulieren):  
  - Option A: Einen **„Clear“‑Button** hinzufügen, der Eingabefelder und Ergebnis‑Label leert (formal schon Teil des geplanten Zielzustands des primitiven Calculators).  
  - Option B: Layout so anpassen, dass Eingabefelder und Buttons übersichtlicher angeordnet sind (z. B. mit `GridPane`).  
- Aufgabe auf Folie formulieren, kurze Klärung von Verständnisfragen, dann 5 Minuten selbst coden.  

---

## 8. Phase 5: Kurze Besprechung Mini‑Aufgabe 1 und Übergang zu Events (40–47 min)

### Ziele der Phase

- Lösungsmuster kurz zeigen.  
- Übergang vom statischen Layout zum dynamischen Verhalten (Events) schaffen.  

### Ablauf

1. **Kurzlösung zeigen (ca. 2–3 min)**  
   - Einen minimalen Lösungscode projizieren (z. B. Clear‑Button oder GridPane‑Variante).  
   - 1–2 ausgewählte Studierende kurz schildern lassen, wie sie vorgegangen sind.  

2. **Brücke zu Events (ca. 4–5 min)**  
   - Problem formulieren: „Layout steht, aber der Calculator rechnet noch nicht oder nur sehr eingeschränkt – was fehlt?”  
   - Begriff EventHandler / `setOnAction` einführen, auf nächste Phase verweisen.  

---

## 9. Phase 6: Event‑Handling in JavaFX am primitiven Calculator (47–60 min)

### Ziele der Phase

- Funktionsweise des Event‑Handlings in JavaFX verstehen.  
- Anwendung auf den „Berechnen“‑Button im primitiven Calculator (z. B. Addition).  

### Inhaltliche Leitstruktur (Folien, z. T. aus `GUIs mit JavaFX (Teil 2).pdf`)

- Event‑Quelle (`Button`), Listener/EventHandler, Lambda‑Ausdrücke.  
- Zugriff auf Inhalte von `TextField`, Ausgabe in `Label`.  
- Grundlegende Fehlerfälle kurz ansprechen (z. B. ungültige Eingabe).  

### Ablauf

1. **Konzeptuell erklären (ca. 5–7 min)**  
   - Folien mit einem schematischen Ablauf: User klickt Button → Event → Handler → Logik → Update der View.  
   - Einfacher Beispielcode mit `button.setOnAction(e -> { ... })`.  

2. **Live‑Coding: Addition im Calculator implementieren (ca. 8–10 min)**  
   - Schrittweise implementieren:  
     - Textfeldwerte auslesen.  
     - In Zahlen umwandeln.  
     - Ergebnis berechnen und in Label schreiben.  
   - Laufend kurze Fragen an Studierende („Woher bekommen wir hier die Eingabe?”, „Was passiert, wenn das Textfeld leer ist?”).  
   - Hinweis: Weitere Operatoren und erweiterte Fehlerbehandlung werden in **Übung 1** von den Studierenden umgesetzt.  

---

## 10. Phase 7: Mini‑Coding‑Aufgabe 2 – Event‑Verhalten / Fehlermeldung (60–65 min)

### Ziele der Phase

- Vertiefung des Event‑Handlings im gleichen Projekt.  
- Studierende ändern selbstständig das Verhalten bzw. ergänzen eine einfache Fehlerbehandlung.  

### Aufgabenstellung (5 min Einzelarbeit)

- Beispiele für Aufgaben (eine auswählen oder nach Schwierigkeit staffeln):  
  - Option A: Den bestehenden „Berechnen“‑Button so erweitern, dass bei ungültiger Eingabe (z. B. leeres Feld, keine Zahl) eine kurze Fehlermeldung im Label angezeigt wird.  
  - Option B: Eine einfache Eingabeprüfung einbauen (z. B. Button deaktivieren, wenn eines der Felder leer ist).  
- Aufgabenstellung auf Folie, 5 Minuten eigenständiges Coden.  

---

## 11. Phase 8: Kurze Besprechung Mini‑Aufgabe 2 (65–70 min)

### Ziele der Phase

- Musterlösung(en) zeigen.  
- Typische Fehler und gute Praktiken kurz ansprechen.  

### Ablauf

- Kurzlösung für eine Variante projizieren (ca. 2–3 min).  
- Hervorheben:  
  - Saubere Trennung von Eingabe‑Lesen, Berechnung, Ausgabe.  
  - Einfache Fehlertests (z. B. leere Felder, ungültige Zahlen).  
  - Bezug zu **Übung 1**: Studierende werden dort mehrere Operatoren und eine Historie‑Liste (ListView) ergänzen – dieselben Prinzipien gelten.  

---

## 12. Phase 9: Ausblick auf Zielzustand SU 1 + Übung 1 und Brücke zu SU 2 (70–82 min)

### Ziele der Phase

- Klarstellen, wie der primitive Calculator nach SU 1 + Übung 1 aussehen soll.  
- Verbindung zur zweiten SU und zur Übung 2 herstellen, ohne Lösungen vorwegzunehmen.  

### Inhaltliche Punkte

- **Zielzustand nach SU 1 + Übung 1**:  
  - Zwei Eingabefelder für Zahlen.  
  - Ein wählbarer Operator (bzw. mehrere Operatoren).  
  - Ein „Berechnen“‑Button.  
  - Ein Ausgabe‑Label für das Ergebnis.  
  - Eine **Historie‑Liste der Berechnungen (ListView)** – Implementierung primär in Übung 1.  
- **Ausblick SU 2 + Übung 2**:  
  - Komplexerer Ganzzahlen‑Calculator mit verschachtelten Layouts, Tabelle unter dem Formular, CSS‑Styling.  
  - Einsatz von FXML und MVP‑Pattern; Studierende vervollständigen in Übung 2 einen unvollständigen Calculator (fehlende UI‑Elemente, fehlende Logik).  

### Ablauf

1. **Visualisierung des Zielzustands von SU 1 + Übung 1 (ca. 6–8 min)**  
   - Folie oder Mockup, das den primitiven Calculator mit Operator, Berechnen‑Button, Ausgabe‑Label und Historie‑ListView zeigt.  
   - Erläutern, welche Teile bereits in SU 1 erarbeitet wurden (Grundlayout, Event‑Handling) und welche in Übung 1 ergänzt werden (Operatoren, Fehlerfälle, ListView).  

2. **Didaktischer Ausblick auf SU 2 und Übung 2 (ca. 6–8 min)**  
   - Erklären, dass SU 2 sich auf  
     - **Verschachtelte Layouts** (Formular oben, Historie‑Tabelle unten),  
     - **CSS‑Design** (z. B. Abstände, Farben, Hervorhebung) und  
     - **MVP/MVC‑Struktur** mit FXML konzentriert, um den komplexeren Ganzzahlen‑Calculator strukturiert zu bauen.  
   - Hinweis, dass die Übungsaufgabe 2 anschließend darin besteht, diesen komplexeren Calculator (unvollständig vorgegeben) zu vervollständigen.  

---

## 13. Phase 10: Zusammenfassung und Lernziel‑Check (82–90 min)

### Ziele der Phase

- Wichtige Kernideen von SU 1 noch einmal bündeln.  
- Studierende einschätzen lassen, ob sie sich in der Lage sehen, mit JavaFX weiterzuarbeiten und in SU 2 an den komplexeren Calculator anzuknüpfen.  

### Ablauf

1. **Inhaltliche Zusammenfassung (ca. 4–5 min)**  
   - Folie mit 4–5 Bulletpoints zu den wichtigsten Konzepten von SU 1:  
     - Aufbau von JavaFX‑Anwendungen.  
     - Layouts und Controls am Beispiel des primitiven Calculators.  
     - Event‑Handling mit `setOnAction`.  
     - Erste Erweiterungen (Clear‑Button, einfache Validierung) als Vorbereitung für Übung 1.  

2. **Lernziel‑Check und Ausblick (ca. 3–4 min)**  
   - Kurze mündliche Rückmeldung einholen, z. B. Handzeichen zu Fragen wie: „Traut ihr euch zu, in der Übung weitere Operatoren und eine Historie‑Liste (ListView) zu ergänzen?”.  
   - Verweis auf **SU 2**, in der komplexe Layouts, CSS und MVP eingeführt werden, um den komplexeren Ganzzahlen‑Calculator zu gestalten, dessen Plan separat beschrieben wird.  

---

## 14. Hinweise für die spätere Folienerstellung mit LLM

- **Struktur übernehmen**: Jeder Zeitblock (Abschnitte 4–13) kann eine eigene Folien‑Gruppe bilden, Titel z. B. „Grundlagen JavaFX“, „Primitiver Calculator“, „Events im Calculator“, „Mini‑Aufgaben“, „Ausblick SU 1 + Übung 1 / SU 2“.  
- **Materialbezug**:  
  - Aus `06-vorlesung.pdf` und `GUIs mit JavaFX (Teil 1+2).pdf` die konzeptionellen Folien zu JavaFX‑Grundaufbau, Layouts, Event‑Handling übernehmen bzw. anpassen.  
  - Aus dem Code in `lession08/src/main/java/de/bht/pr2/lession08` (insb. `e06_calculator`) Code‑Snippets extrahieren, die auf Folien in gekürzter Form gezeigt werden können.  
  - Wo Lücken in Beispielen bestehen, zusätzliche kleine Snippets für Clear‑Button, einfache Validierung und spätere Operator‑Erweiterungen ergänzen.  
- Die **Historie‑ListView**, verschachtelte Layouts mit Tabelle, CSS‑Beispiele und MVP‑Skizzen werden dann im Foliensatz für **SU 2** detailliert aufgegriffen.  

---

## 15. Motivation und Ziel dieses Plans (für Weitergabe an Entwickler / Foliendesigner)

- **Motivation**: Die Studierenden sollen von rein textbasierten Java‑Programmen zu interaktiven grafischen Anwendungen geführt werden, wobei JavaFX als praxisnahes Toolkit dient und ein konkretes, überschaubares Beispiel (Calculator) den roten Faden über zwei SUs und zwei Übungen bildet.  
- **Ziel des Plans für SU 1**: Eine klar strukturierte 90‑Minuten‑Sitzung bereitzustellen, die es ermöglicht, aus den vorhandenen PDFs und dem Code in `lession08` mit Hilfe eines LLMs einen konsistenten Foliensatz und passende Demo‑Code‑Ausschnitte zu generieren, die den primitiven Calculator und erste Erweiterungen (Clear‑Button, einfache Fehlerbehandlung) behandeln und auf Übung 1 vorbereiten.  
- **Verweis auf zweite SU**: Ein separater Lehrplan für **SU 2** wird erstellt und fokussiert auf komplexe Layouts, CSS‑Styling sowie MVP‑Architektur mit FXML, um den komplexeren Ganzzahlen‑Calculator (unvollständig vorgegeben, in der Übung zu vervollständigen) systematisch zu entwickeln.  
