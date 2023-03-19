
public class E6_14_Tester
{
   public static void main (String args[])
   {
       int x;
       for (int i = 1; i <= 10; i++)
       {
           for(int m = 1; m <= 10; m++)
           {
                x = i * m;
               
                System.out.printf("%4d", x);
           }
           System.out.println("");
       }
   }
}
