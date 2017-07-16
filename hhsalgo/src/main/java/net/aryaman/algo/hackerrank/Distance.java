package net.aryaman.algo.hackerrank;
import java.util.Scanner;;

public class Distance
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
      String response;
      
      
      System.out.println("How many MPGs does your car contain");
      response = userInput.next();
      double mpg = Double.parseDouble(response);
      
      System.out.println("How many miles apart is your house and Foothill?");
      response = userInput.next();
      double miles = Double.parseDouble(response);
      
      System.out.println("So your car has " + mpg + " MPG and you live " 
            + miles + " miles from Foothill");
      
      if (mpg <= 0)
      {
         System.out.println(mpg + " MPG is impossible!");
         if (miles <= 0)
            System.out.println(miles + " miles is impossible!");
         else 
         System.exit(0);  
      }  
   
      int daysPerWeek = 2;
      int weeks = 12;
      int totalDays = daysPerWeek * weeks;
      
      double gasLow = 2.75;
      double gasMed = 3.75;
      double gasHigh = 4.75;
      
      double mpq = totalDays * miles;
      double fuelTimes = mpq / mpg;
       
      System.out.println("\nIn " + weeks + " weeks, you'll save $" + 
      (fuelTimes * gasLow) + " for $2.75 gas, you'll save $" + 
      (fuelTimes * gasMed) + " for $3.75 gas, and you'll save $"
            +(fuelTimes * gasHigh) + " for $4.75 gas");
            
      int instructorKids = 120; 
      System.out.println("\nIn " + weeks + " weeks, your classmates will save $" 
      + (fuelTimes * gasLow * instructorKids) + " for $2.75 gas, they'll save $" 
            +(fuelTimes * gasMed * instructorKids) + " for $3.75 gas, "
                  + "and they'll save $" +(fuelTimes * gasHigh * instructorKids)
                  + " for $4.75 gas");
      int allKids = 3500;
      System.out.println("\nIn " + weeks + " weeks, all Foothill online students"
            + " will save $" +(fuelTimes * gasLow * allKids) + " for $2.75 gas, "
                  + "they will save $" + (fuelTimes * gasMed * allKids) + " for "
                        + "$3.75 gas, " + "and they'll save $" +
                           (fuelTimes * gasHigh *allKids) + " for $4.75 gas");
     
     userInput.close();
   }
}
