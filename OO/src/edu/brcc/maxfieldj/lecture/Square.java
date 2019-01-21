package edu.brcc.maxfieldj.lecture;

public class Square extends Shape {
   private double side;

   public Square() {
      setSide(0.0);
   }

   public Square(double side) {
      setSide(side);
   }

   public double getSide() {
      return side;
   }

   public void setSide(double side) {
      if (side >= 0) {
         this.side = side;
      }
   }

   @Override
   public String toString() {
      return "Square{" +
          "side=" + side +
          '}';
   }

   @Override
   public double getArea() {
      return side * side;
   }
}
