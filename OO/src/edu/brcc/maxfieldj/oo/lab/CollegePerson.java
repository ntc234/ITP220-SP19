package edu.brcc.maxfieldj.oo.lab;

/**
 * Add a college ID to the Person class
 * 2017-01-13
 * @author john maxfield
 */
public abstract class CollegePerson extends Person {
   private String ID;                // the ID e.g. "2341234"

   /**
    * no-arg constructor
    * explicitly calls super class constructor
    * calls setters to set attributes
    */
   public CollegePerson() {
      super();
      this.setID("");
   }

   /**
    * constructor with only the attribute for this class
    * explicitly calls super class constructor
    * calls setters to set attributes
    * @param ID
    */
   public CollegePerson(String ID) {
      super();
      this.setID(ID);
   }

   /**
    * set all attributes
    * explicitly calls super class constructor
    * calls setters to set attributes
    * @param firstName first name of person
    * @param lastName last name of person
    * @param ID the ID for the college person
    */
   public CollegePerson(String firstName, String lastName, String ID) {
      super(firstName, lastName);
      this.setID(ID);
   }

   /**
    * standard getter for ID
    * @return the ID for the college person
    */
   public String getID() {
      return this.ID;
   }

   /**
    * standard setter for ID
    * @param ID the ID for the college person
    */
   public void setID(String ID) {
      this.ID = ID;
   }

   /**
    * generated toString
    * calls super class toString
    * @return a String representation of the college person (including ID, first & last names)
    */
   @Override
   public String toString() {
      return "CollegePerson{" +
          "ID='" + ID + '\'' +
          "} " + super.toString();
   }
}
