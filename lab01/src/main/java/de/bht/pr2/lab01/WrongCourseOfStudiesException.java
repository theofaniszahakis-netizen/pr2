package de.bht.pr2.lab01;

public class WrongCourseOfStudiesException extends Exception {
    WrongCourseOfStudiesException(String message){
        super("Kein bekannter Studiengang :" +message);
    }
}
