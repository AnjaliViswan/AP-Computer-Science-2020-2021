import java.util.Scanner;
import java.lang.String;
public class E4_7
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       System.out.print("Input Radius: ");
       double radius = in.nextDouble();
       System.out.println("Area: " +  (Math.PI * Math.pow(radius, 2)));
       System.out.println("Circumference: " + (2*(Math.PI * radius)));
       System.out.println("Volume: " + (4/3*(Math.PI*(Math.pow(radius, 3)))));
       System.out.println("Surface Area: " + (4*(Math.PI*(Math.pow(radius, 2)))));
    }
}
