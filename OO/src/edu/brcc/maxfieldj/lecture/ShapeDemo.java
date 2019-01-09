package edu.brcc.maxfieldj.lecture;

public class ShapeDemo {
   public static void main(String[] args) {
      Circle circle = new Circle(1.0);
      ColoredCircle coloredCircle = new ColoredCircle(2.0, "blue");
      Square square = new Square(2.1);

      Shape shape1 = new Circle(2.0);
      Shape shape2 = new Square(3.0);

      System.out.println(coloredCircle);
      System.out.println(square);

      circle.setCenter(1,2);
      square.setCenter(2,3);
      shape1.setCenter(3, 4);
      shape2.setCenter(4,5);

      tellMeAbout(circle);
      tellMeAbout(coloredCircle);
      tellMeAbout(shape1);
      tellMeAbout(shape2);
   }

   private static void tellMeAbout(Shape shape) {
      System.out.printf("%s", shape);
      System.out.printf(": Area = %f", shape.getArea());
      System.out.printf(" at (%.3f, %.3f)\n", shape.getCenterX(),
                        shape.getCenterY());
   }
}
