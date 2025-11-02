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
        // TODO: Here goes your code ...

          String[] Data = dataRow.split(",");
          if (Data.length != 4) {
              throw new StudentParseException(dataRow);
          }
          this.name = Data[0].trim();
          try {
              this.registrationNumber = Integer.parseInt(Data[1]);
          } catch (NumberFormatException e) {
              throw new RegistrationNumberException(this.registrationNumber);
          }
          this.courseOfStudies = Data[2].trim();
          int tuiutionFee = Integer.parseInt(Data[3]);
          if(tuiutionFee < TUITION_FEE) {
              throw new NotPaidTuitionFeeException(TUITION_FEE-tuiutionFee);
          }
          // this.Tuition_Fee=Integer.parseInt(Data[3]);

          if (String.valueOf(this.registrationNumber).length() != 5) {
              throw new RegistrationNumberException(this.registrationNumber);
          }

          if (!courseOfStudies.equals("Medieninformatik") && (!courseOfStudies.equals("Technische Informatik") && (!courseOfStudies.equals("Druck- und Medientechnik") && (!courseOfStudies.equals("Screen Based Media") )))) {
              throw new WrongCourseOfStudiesException(this.courseOfStudies);
          }

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






