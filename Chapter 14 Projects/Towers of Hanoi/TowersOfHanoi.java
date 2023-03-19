public class TowersOfHanoi
{
    public void hanoi(int numDiscs, int fromPeg, int toPeg, int freePeg)
    {
        if(numDiscs == 1)
        {
            System.out.println("from " + fromPeg + " to " + toPeg);
        }
        else
        {
            hanoi(numDiscs - 1, fromPeg, freePeg, toPeg); //calling it in itself
            hanoi(1, fromPeg, toPeg, freePeg);
            hanoi(numDiscs - 1, freePeg, toPeg, fromPeg); //this can happen because a variable changes, numofDisks
        }
    }
}