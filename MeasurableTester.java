/**
   This program demonstrates the measurable Country class.
*/

import java.util.*;

public class MeasurableTester
{
   public static void main(String[] args)
   {
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);

      for(Measurable c: countries)
         System.out.println(c);

      System.out.println("\nThe average surface area of these countries is: " +
	    Measurable.average(countries));
      System.out.println("Expected: 239950.0");

      //---------------- PART 2 ----------------------
      System.out.println("\nPART 2: maximum");
      Measurable maxCountry = Measurable.max(countries);
      System.out.println("Maximum area: " + maxCountry.getMeasurement());
      System.out.println("Expected: 513120");
      

      //---------------- PART 3 ----------------------
      System.out.println("\nPART 3: sorter");
      Arrays.sort(countries);
      for(Measurable c: countries)
      System.out.println(c);
      
   }
}
