package edu.brcc.maxfieldj.oo.lab;

/**
 * a simple representation of a student
 * 2017-01-13
 * @author john maxfield
 */
public class Student extends CollegePerson {
   private String major;       // the student's major, e.g. "Computer Science"

   /**
    * no-arg constructor
    * explicitly calls super class constructor
    * calls setters to set attributes
    */
   public Student() {
      super();
      this.setMajor("");
   }

   /**
    * constructor with only the attribute for this class
    * explicitly calls super class constructor
    * calls setters to set attributes
    * @param major the student's major
    */
   public Student(String major) {
      super("");
      this.setMajor(major);
   }

   /**
    * set all attributes
    * explicitly calls super class constructor
    * calls setters to set attributes
    * @param firstName first name of person
    * @param lastName last name of person
    * @param ID the ID for the college person
    * @param major the student's major
    */
   public Student(String firstName, String lastName, String ID, String major) {
      super(firstName, lastName, ID);
      this.setMajor(major);
   }

   /**
    * standard getter for major
    * @return the student's major
    */
   public String getMajor() {
      return major;
   }

   /**
    * standard setter for major
    * @param major the student's major
    */
   public void setMajor(String major) {
      this.major = major;
   }

   /**
    * generated toString
    * calls super class toString
    * @return a String representation of the student (including all relevant fields)
    */
   @Override
   public String toString() {
      return "Student{" +
          "major='" + major + '\'' +
          "} " + super.toString();
   }
}
