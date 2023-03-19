import java.util.Scanner;
import java.util.Arrays;

public class E6_4_Tester
{
     public static void main (String args[])
    
    {
        int[] temps = {};
        Scanner in = new Scanner(System.in);
        for ( int i = 1; i <= 12; i++)
        {
            
            System.out.println("Input temperature #" + i);
            
            temps = Arrays.copyOf(temps, temps.length + 1); //adds a position to the array
            temps[temps.length - 1] = in.nextInt();           //appends temperature in last position of temps array
        }
        int x1 = 0;             //x1 and x2 are counters to iterate through the temps
        int x2 = 1;
        int n1 = temps[x1];     //n1 and n2 will be compared
        int n2 = temps[x2];
        int box = 0;           //box stores the greater temp
        
        for (int i = 0; i < 11; i++) //iterates through every temperature in temps array and compares a greatest value, then stores it in box variable
        {

            n1 = temps[x1];
            n2 = temps[x2];
            
            
            if (n1 > n2 && n1 > box)
            {
                box = n1;
            }
            else if (n2 > n1 && n2 > box)
            {
                box = n2;
            }
            x1++;
            x2++;
        }   
        String[] months = {"January", "Febuary", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"}; // array of every month to match a month to the temperature by parallel positions
        String monthFinal = "NULL"; //empty variable to store the hottest month
        for(int i = 0; i < 12; i++) //finds a matching temperature array postion to the month array position, and stores in monthFinal variable
        {
             if (box == temps[i]) 
             {
                 monthFinal = months[i];
             }
            
        }
        System.out.println("HOTTEST MONTH: " + monthFinal); //Printing output...
    }
}
