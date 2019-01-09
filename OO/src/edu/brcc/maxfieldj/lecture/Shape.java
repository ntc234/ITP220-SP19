package edu.brcc.maxfieldj.lecture;

public abstract class Shape implements Centered {
   private double x, y;     // center of the shape

   public abstract double getArea();

   @Override
   public void setCenter(double x, double y) {
      this.x = x;
      this.y = y;
   }

   @Override
   public double getCenterX() {
      return x;
   }

   @Override
   public double getCenterY() {
      return y;
   }
}
