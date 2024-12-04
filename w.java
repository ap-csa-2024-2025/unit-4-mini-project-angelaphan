public class Main
{
	public static void main(String[] args)
    {

    }
    public int getPlayer2Move(int round)
    {
        int result;
        if (round%3==0)
        {
            result= 3;
        }
        else
        {
            if (round%2==0)
            {
                result= 2;
            }
            else 
            {
                result= 1;
            }
        }
        return result;
    }
    public int getPlayer1Move()
    {
        return 0;
    }
    public void playGame()
    {
        int startingCoins;
        int maxRounds;
        int coins1= startingCoins;
        int coins2= startingCoins;
        

    }
}