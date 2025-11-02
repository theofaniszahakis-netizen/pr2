package de.bht.pr2.lab01;

public class RegistrationNumberException extends Exception {
    RegistrationNumberException(int message){
        super("Matrikelnummer hat das Falsche Format ");
    }
}
