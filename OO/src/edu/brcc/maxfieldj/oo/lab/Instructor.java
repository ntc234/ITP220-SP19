package edu.brcc.maxfieldj.oo.lab;

/**
 * a simple representation of an instructor
 * 2017-01-13
 * @author john maxfield
 */
public class Instructor extends CollegePerson {
   private String office;            // the instructor's office #, e.g. "D124"

   /**
    * no-arg constructor
    * explicitly calls super class constructor
    * calls setters to set attributes
    */
   public Instructor() {
      super();
      this.setOffice("");
   }

   /**
    * constructor with only the attribute for this class
    * explicitly calls super class constructor
    * calls setters to set attributes
    * @param office a String, e.g. as "D124"
    */
   public Instructor(String office) {
      super("");
      this.setOffice(office);
   }

   /**
    * sets all fields here and in superclass
    * @param firstName The Person first name
    * @param lastName the Person last name
    * @param ID the CollegePerson ID
    * @param office a String, e.g. as "D124"
    */
   public Instructor(String firstName, String lastName, String ID, String office) {
      super(firstName, lastName, ID);
      this.setOffice(office);
   }

   /**
    * standard getter for office
    * @return the instructor's office #
    */
   public String getOffice() {
      return office;
   }

   /**
    * standard setter for office
    * @param office a String, e.g. as "D124"
    */
   public void setOffice(String office) {
      this.office = office;
   }

   /**
    * generated toString
    * calls super class toString
    * @return a String representation of the student (including all relevant fields)
    */
   @Override
   public String toString() {
      return "Instructor{" +
          "office='" + office + '\'' +
          "} " + super.toString();
   }
}
