public class TesterTowers
{
    public static void main(String [] args)
    {
        TowersOfHanoi game = new TowersOfHanoi();
        
        game.hanoi(30, 1, 3, 2); // playing with 3 pegs, peg in 1 to peg number 3 and empty peg is 2
        
    }
}