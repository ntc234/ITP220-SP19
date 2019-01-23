package edu.brcc.maxfieldj.lecture;

import java.util.zip.DataFormatException;

public class ThrowException {
   public static void main(String[] args)  {
      try {
         nastyMethod(2);
      }
      catch (Not42Execption e) {
//         System.out.println("nastyMethod doesn't like 2");
//         System.out.println(e.getMessage());
         e.printStackTrace();
      }
      System.out.println("bye now");
   }

   private static void nastyMethod(int num)
       throws Not42Execption {
      if (num != 42) {
         throw new Not42Execption();
      }
   }
}
