package edu.brcc.maxfieldj.oo.lab;

/**
 * a simple person class
 * 2017-01-13
 * @author john maxfield
 */
public class Person {
   private String firstName;       // first name of the person
   private String lastName;        // last name of the person

   /**
    * no-arg constructor
    * implicitly calls super class no-arg constructor
    * calls the other constructor
    */
   public Person() {
      // call to other constructor (including super()) must be first statement
      // so can't do both this() and super()
      this("","");
   }

   /**
    * implicitly calls super class no-arg constructor
    * calls setters to set attributes
    * @param firstName first name of person
    * @param lastName last name of the person
    */
   public Person(String firstName, String lastName) {
      super();                    // call Object contructor (happens even without this statement)
      setFirstName(firstName);
      setLastName(lastName);
   }

   /**
    * standard getter for first name
    * @return first name of person
    */
   public String getFirstName() {
      return firstName;
   }

   /**
    * standard setter for first name
    * @param firstName first name of person (String)
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   /**
    * standard getter for last name
    * @return last name of the person
    */
   public String getLastName() {
      return lastName;
   }

   /**
    * standard setter for last name
    * @param lastName last name of the person
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   /**
    * generated toString
    * @return a String representation of the person (including first & last names
    */
   @Override
   public String toString() {
      return "Person{" +
          "firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          '}';
   }
}
