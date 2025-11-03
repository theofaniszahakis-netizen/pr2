package de.bht.pr2.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Testkonstruktor {
@Test
public void testheconstructor() {



        assertThrows(NotPaidTuitionFeeException.class,
                () ->{
                    Student student =new Student("Paul,10984,Medieninformatik,311");
                });


}
    @Test
    public void testheconstructor1() {



        assertThrows(RegistrationNumberException.class,
                () ->{
                    Student student =new Student("Paul,109858,Medieninformatik,317");
                });


    }
    @Test
    public void testheconstructor3() {



        assertThrows(StudentParseException.class,
                () ->{
                    Student student =new Student("Paul,,Medieninformatik,");
                });


    }
    @Test
    public void testheconstructor2() {



        assertThrows(WrongCourseOfStudiesException.class,
                () ->{
                    Student student =new Student("Paul,10929,Medieninformatik_gibt_es_nicht,312");
                });


    }
}

