package de.bht.pr2.lab01;

public class Student {
    //-------------------------------------------
    // Attribute
    private String name = "";

    // Matrikelnummer
    private int registrationNumber = 0;

    // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
    private String courseOfStudies = "";

    // Rückmeldegebühr
    public static final int TUITION_FEE = 312;

    /**
     * This contructor parses a comma-separated row describing a student object.
     *
     * @param dataRow a comma-separated row describing a student object
     */

    public Student(String dataRow) throws Exception {
        // TODO: Here goes your code ...//

        String[] data = dataRow.split(",");
        if (data.length != 4) {//name Matrikelnr Studiengang gebühr
            throw new StudentParseException(dataRow);
        }

        this.name = data[0].trim();//name in name der attribut der klasse trim entfern leerzeichen
        try {
            this.registrationNumber = Integer.parseInt(data[1]);//Matrikelnr --->zu INTEGER
        } catch (NumberFormatException e) {//falls keine gültige zahl wird abgefangen programm stürzt nicht ab
            throw new RegistrationNumberException(data[1]);//gibt falschen text zurück
        }
        this.courseOfStudies = data[2].trim();//Studiengang

        int tuiutionFee = 0;//Tuition ---> INTeger
        try {
            tuiutionFee = Integer.parseInt(data[3]);
        } catch (NumberFormatException e) {
            throw new StudentParseException(e.getMessage());//SPE
        }
        if (tuiutionFee < TUITION_FEE) {
            throw new NotPaidTuitionFeeException(TUITION_FEE - tuiutionFee);
        }//kein student wird erzeugt der nicht 312 gezahlt hat


        if (String.valueOf(this.registrationNumber).length() != 5) {
            //Integer muss 5 stsszzellen haben Matrikelnr
            throw new RegistrationNumberException(data[1]);
        }//die zahl wird zurückgegeben

        if (!courseOfStudies.equals("Medieninformatik")
                && (!courseOfStudies.equals("Technische Informatik")
                && (!courseOfStudies.equals("Druck- und Medientechnik")
                && (!courseOfStudies.equals("Screen Based Media"))))) {
            throw new WrongCourseOfStudiesException(this.courseOfStudies);
        }//Es muss einer dieser Sgtudiengänge sein

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", matrikelnummer=" + registrationNumber +
                ", studiengang='" + courseOfStudies + '\'' +
                TUITION_FEE;
    }
}






