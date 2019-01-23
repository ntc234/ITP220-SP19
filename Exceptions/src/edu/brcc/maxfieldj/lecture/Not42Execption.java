package edu.brcc.maxfieldj.lecture;

public class Not42Execption extends Exception {
   public Not42Execption(String s) {
      super("I don't like: " + s);
   }
   public Not42Execption(){
      super("I don't like that number");
   }
}
