
import java.util.Random;
public class DieSimulator
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int number = generator.nextInt(7);//Numbers between 0-7
        System.out.println("Rolling...");
        System.out.print("You rolled a " + number + ".");//Generator is between 0-7
        System.out.println();
    }

}
