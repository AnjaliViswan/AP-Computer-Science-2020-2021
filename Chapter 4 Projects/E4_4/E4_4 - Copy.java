import java.util.Scanner;
import java.lang.String;
public class E4_4
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Input Integer 1: ");
       int int1 = in.nextInt();
       System.out.print("Input Integer 2: ");
       int int2 = in.nextInt();
       System.out.println("Calculating...");
       //Calculating...
       System.out.println("Sum: " + (int1 + int2));//Sum
       //Difference
       System.out.print("Positive Difference: ");
       if (int1>int2) 
       {
           System.out.println(int1-int2);
       }
       else 
       {
           System.out.println(int2-int1);
       }
       System.out.println("Difference: " + Math.subtractExact(int1, int2));
       System.out.println("Product: " + int1 * int2); //Product
       System.out.println("Average: " + ((int1 + int2)/2));// Average
       System.out.println("Distance: " + Math.abs(int1 - int2));//Distance
       System.out.println("Maximum: " + Math.max(int1, int1));//Maximum
       System.out.println("Minimum: " + Math.min(int1, int2));//Minimum
       
   }
}