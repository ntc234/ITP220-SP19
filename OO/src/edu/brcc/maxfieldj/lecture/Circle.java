package edu.brcc.maxfieldj.lecture;

public class Circle {
   private double radius;

   public Circle() {
   }

   public Circle(double radius) {
      setRadius(radius);
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      if (radius >= 0) {
         this.radius = radius;
      }
   }

   public double getCircumference() {
      return 2 * Math.PI * radius;
   }

   @Override
   public String toString() {
      return "Circle{" +
          "radius=" + radius +
          '}';
   }
}
