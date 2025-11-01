package de.bht.pr2.lab01;

public class StudentParseException extends Exception{
    StudentParseException(String message){
        super("Zeile enthält zu wenig Kommas"+message);



    }
}
