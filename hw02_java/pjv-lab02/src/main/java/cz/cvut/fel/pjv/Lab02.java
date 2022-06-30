/*
 * File name: Lab06.java
 * Date:      2014/08/26 21:39
 * Author:    @author
 */

package cz.cvut.fel.pjv;

public class Lab02 {

   public void homework() {
      int count=0, count_line=1;
      double avg=0, dev=0;
      double[] num = new double[10];

      TextIO io = new TextIO();
      String in = io.getLine();

      while (!in.equals("") && count < 10){

         if (TextIO.isInteger(in) || TextIO.isFloat(in) || TextIO.isDouble(in)) {
            num[count] = Double.parseDouble(in);
            avg += num[count];
            count++;
            in = io.getLine();
            count_line++;
         } else {
            System.out.printf("A number has not been parsed from line %d%n", count_line);
            in = io.getLine();
            count_line++;
         }
         if (count == 10){
            for (int i = 0; i < count; i++) {
               dev = dev + ((num[i] - (avg / count)) * (num[i] - (avg / count)));
            }
            System.out.printf("%2d %.3f %.3f%n", count, avg / count, Math.sqrt(dev / count));
            count = 0;
            avg = 0;
            dev = 0;
         }
         if (in.equals("")) {
            System.out.println("End of input detected!");
         }
      }

      if(count > 1) {
         for (int i = 0; i < count; i++) {
            dev = dev + ((num[i] - (avg / count)) * (num[i] - (avg / count)));
         }
         System.out.printf("%2d %.3f %.3f%n", count, avg / count, Math.sqrt(dev / count));
      }
   }
}
