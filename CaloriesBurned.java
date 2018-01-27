/**
This program calculates the amount of energy expended 
using the concept of metabolic equivalents.  
The formula used is: 
Calories/Minute = 0.0175 * MET * WeightInKilos 
One Kg = 2.2 Pounds

@author Timothy McWatters
@version 1.0

COP2253    Workshop 2
File Name: CaloriesBurned.java
*/

public class CaloriesBurned {
   // Program Constants
   private static final double RUN_METS = 10;
   private static final double BB_METS = 8;
   private static final double SLEEP_METS = 1;
   
   private static final double WEIGHT = 165.0;
   private static final double WEIGHT_IN_KG = WEIGHT / 2.2;
   
   private static final double RUN_TIME = 30.0;
   private static final double BB_TIME = 1.0 * 60;
   private static final double SLEEP_TIME = 8.0 * 60;
      
   public static void main(String[] args) {
      // Variable Declarations      
      double runCalories = 0.0175 * RUN_METS * WEIGHT_IN_KG * RUN_TIME;
      double bbCalories = 0.0175 * BB_METS * WEIGHT_IN_KG * BB_TIME;
      double sleepCalories = 0.0175 * SLEEP_METS * WEIGHT_IN_KG * SLEEP_TIME;
      double totalCalories = runCalories + bbCalories + sleepCalories;
        
      String name = "Timothy";
   
      System.out.println("Welcome to the calorie calculator.");
      System.out.printf("This program will calculate calories burned for %s who weights %.1f pounds.%n", name, WEIGHT); 
      System.out.printf("%s burned an estimated %.2f calories running.%n", name, runCalories);
      System.out.printf("%s burned an estimated %.2f calories playing basketball.%n", name, bbCalories);
      System.out.printf("%s burned an estimated %.2f calories sleeping.%n", name, sleepCalories);
      System.out.printf("%s expended a total of: %.2f calories.%n", name, totalCalories);
   }
}