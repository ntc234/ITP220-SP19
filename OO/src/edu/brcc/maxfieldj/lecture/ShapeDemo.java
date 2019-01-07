package edu.brcc.maxfieldj.lecture;

public class ShapeDemo {
   public static void main(String[] args) {
      Circle circle = new Circle(1.0);
      ColoredCircle coloredCircle = new ColoredCircle(2.0, "blue");

      System.out.println(coloredCircle);
   }
}
