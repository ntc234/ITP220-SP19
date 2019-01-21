package edu.brcc.maxfieldj.oo.lab;

/**
 * exercise the Person/CollegeStudent/Instructor/Student classes
 * 2017-01-13
 * @author john maxfield
 */
public class SomePeople {
   public static void main(String[] args) {
      CollegePerson[] collegePersons = new CollegePerson[3];

      collegePersons[0] = new Instructor("John", "Maxfield", "5077777", "D124");
      collegePersons[1] = new Student("Alec", "Smart", "123567", "Computer Science");
      collegePersons[2] = new Student("Noe", "Jobprospect", "7654321", "English");

      for (CollegePerson collegePerson : collegePersons) {
         System.out.println(collegePerson);
      }
   }
}
