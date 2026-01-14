package de.bht.pr2.lession08.su2_e02_calculator.model;

import de.bht.pr2.lession08.su2_e02_calculator.presenter.Operator;

/**
 * Model-Klasse für den Calculator.
 * Enthält die Geschäftslogik und den Zustand des Calculators.
 *
 * ÜBUNG 2: Diese Klasse ist unvollständig!
 * Studierende sollen die fehlende Logik implementieren.
 */
public class CalculatorModel {
    public static final String INITIAL_VALUE = "0";
    private double number1;
    private double number2;
    private String display;

    public CalculatorModel() {
        this.number1 = 0.0;
        this.number2 = 0.0;
        this.display = INITIAL_VALUE;
    }

    public String getCurrentValue() {
        return display;
    }

    public void appendNumber(int number) {
        if (display.equals(INITIAL_VALUE)) {
            display = Integer.toString(number);
        } else {
            display += Integer.toString(number);
        }
    }

    public void appendComma() {
        if (display.equals(INITIAL_VALUE)) {
            return;
        }
        if (!display.contains(",")) {
            display = display + ",";
        }
    }

    /**
     * TODO: Implementieren Sie diese Methode in Übung 2!
     * Fügt einen Operator hinzu und führt die Berechnung durch.
     */
    public void addOperator(Operator operator) {
        if (display.equals(INITIAL_VALUE)) {
            return;
        }
        // TODO: Implementieren Sie die Operator-Logik
        switch (operator) {
            // Fügen Sie hier die Implementierung hinzu
        }
    }

    public void clear() {
        display = INITIAL_VALUE;
        number1 = 0.0;
        number2 = 0.0;
    }

    public void deleteLastDigit() {
        display = display.substring(0, display.length() - 1);
        if (display.isEmpty()) {
            display = INITIAL_VALUE;
        }
    }

    /**
     * TODO: Implementieren Sie diese Methode in Übung 2!
     */
    public void add() {
        /*
        Beispiel-Ablauf:
        0
        2 | 2
        3 | 23
        + | 23+
        4 | 23+4
        = | 27
         */
    }
}
