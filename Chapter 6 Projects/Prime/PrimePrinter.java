import java.util.Scanner;
public class PrimePrinter
{
    public static void main(String args[])
    {
        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        PrimeGenerator gen = new PrimeGenerator();
      
        int prompt = in.nextInt();
  
       for (int m = 0; m <= prompt; m++) //checks every number in 20
        {
            boolean input = gen.isPrime(m);
            if (input == true) //if the number is a prime
            {
                System.out.println(m); //print it out
            }
        }   
    }
}
