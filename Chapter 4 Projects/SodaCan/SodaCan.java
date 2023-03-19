import java.util.Scanner;
public class SodaCan
{
   private double height = 4.83;
   private double diameter = 2.13;
   public double getVolume()
   {
       
       double volume = (height*diameter);
       System.out.println("Volume: " + volume);
       return 0;
    }
   public double getSurfaceArea()
   {
       double volume = (height*diameter);
       System.out.println("Surface Area: " + volume);
       return 1;
   }
}
