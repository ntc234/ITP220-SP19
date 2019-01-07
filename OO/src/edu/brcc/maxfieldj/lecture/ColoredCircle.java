package edu.brcc.maxfieldj.lecture;

public class ColoredCircle extends Circle {
   private String color;

   public ColoredCircle() {
   }

   public ColoredCircle(String color) {
      this.color = color;
   }

   public ColoredCircle(double radius, String color) {
      super(radius);
      this.color = color;
   }

   @Override
   public String toString() {
      return "ColoredCircle{" +
          "color='" + color + '\'' +
          "} " + super.toString();
   }
}
