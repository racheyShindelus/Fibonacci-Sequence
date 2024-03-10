// CSC 130 - Lab Assignment 1
// Shindelus, Rachel
// DUE: Feb 9th, 2024

import java.util.*;

public class Fibonacci 
{
   static final int numOfOutputs = 6;
   
   // Computation of the final fibonacci number
   public static int computeFibonacci(int numOfTerms)
   {
      // Fib: 0, 1, 1, 2, 3, 5, 8, 13, 21... nextNum = two preceding nums
      int firstNum = 0;
      int secondNum = 1;
      int nextNum = firstNum + secondNum;
      for ( int i = 0; i < numOfTerms - 1; i++ )
      {
         firstNum = secondNum;
         secondNum = nextNum;
         nextNum = firstNum + secondNum;
      }
      return nextNum; 
   }
   
   public static void main(String[]args)
   {
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      // Get the starting argument
      int startArg = -1;
      while ( startArg < 0 )
      {
         System.out.print("Enter a positive integer: ");
         startArg = myObj.nextInt();     // Read user input
      }
      // Record time before calling your method
      long startTime = System.currentTimeMillis();
      
      for(int i = 0; i < numOfOutputs; i++)
      {
         System.out.print("The Fibonacci term at position " + (startArg + i)+ " is ");
         // Compute fibonacci number
         System.out.println(computeFibonacci(startArg + i));
         
         // Record time after calling the mathod
         long endTime = System.currentTimeMillis();
      
         // Compute and print ellapsed time in seconds
         long seconds = (endTime - startTime); // / 1000; 
         System.out.println("Computed in " + seconds + " milli-seconds (" + (seconds/1000F) + " seconds).");
      }
   }  // END main()
}  // END Fibonacci Class


