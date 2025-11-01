package de.bht.pr2.lab01;

public class NotPaidTuitionFeeException extends Exception {
    NotPaidTuitionFeeException(int message){
        super("Gebühr wurde nicht bezahlt"+ message);
    }
}
