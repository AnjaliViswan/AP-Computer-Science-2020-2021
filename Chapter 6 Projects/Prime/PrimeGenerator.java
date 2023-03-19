
public class PrimeGenerator
{
    private int x;
    private double EPSILON = 1E-14;
    public boolean isPrime(int cap)
    { 
       for (int i = 1; i <= cap; i++) //for every number in the number given
       { 
            x = 0; //counter for how many cap%i == 0 is true
            if( ((cap % i) == 0) && i != 1 && i != 0) //if its not prime
            {
                x++; //no matter what the counter will be atleast 1 because the loop checks all the way through to the number divided by itself
            }

       }
       if (x == 1) //if prime, x will be only 1
            return true;
       else
            return false;

    }
}
