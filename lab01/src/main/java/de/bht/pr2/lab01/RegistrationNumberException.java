package de.bht.pr2.lab01;

public class RegistrationNumberException extends Exception {
    RegistrationNumberException(int message){
        super("Matrikelnummer hatdas Falsche Format"+message);
    }
}
