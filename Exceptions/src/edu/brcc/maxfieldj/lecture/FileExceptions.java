package edu.brcc.maxfieldj.lecture;

import java.io.*;
import java.util.Scanner;

public class FileExceptions {
   private Scanner userIn;
   private PrintWriter userOut;

   public FileExceptions() {
   }

   public FileExceptions(InputStream inputStream, PrintStream stream) {
      FileInputStream fileInputStream;
      userIn = new Scanner(inputStream);
      userOut = new PrintWriter(stream, true);  // true means autoflush
      Scanner inFile;
      String line;

      userOut.println("Enter the name of a file to read");
      try
      {
         fileInputStream = new FileInputStream(userIn.next());
         inFile = new Scanner(fileInputStream);
         while (inFile.hasNext()) {
            line = inFile.nextLine();
            userOut.println(line);
         }
         fileInputStream.close();
      }
      catch (FileNotFoundException e) {
         //         e.printStackTrace();
         userOut.println(e.getMessage());
         userOut.println("Hey, get it right next time.");
      }
      catch (IOException e) {
//         userOut.println(e.getMessage());
      }
      System.out.println("Now the program continues after the catch");
      userOut.close();
      userIn.close();
   }

   public static void main(String[] args)  {
      new FileExceptions(System.in, System.out);
   }
}













