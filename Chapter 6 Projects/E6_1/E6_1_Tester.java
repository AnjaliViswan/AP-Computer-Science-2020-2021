import java.lang.Math;
public class E6_1_Tester
{
    public static void main (String args[])
    {
        int sum = 0;
        //The sum of all even numbers between 2 and 100 inclusive.
        for ( int i = 2; i <= 100; i++)
        {
            if( i % 2 == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("a.) SUM: " + sum);
        //Sum of all squares between 1 and 100 (inclusive)
        double dSum = 0;
        for ( int i = 0; i <= 10; i++)
        {
            dSum = dSum + Math.pow(i, 2);
        }
        System.out.println("b.) SUM: " + dSum);
        dSum = 0;
        double x;
        for ( int i = 0; i <=20; i++)
        {
            x = i;
            dSum = Math.pow(2, x);
            System.out.println("c.) Sum of 2 to the power of " + i + ": " + dSum);
        }
    }
}