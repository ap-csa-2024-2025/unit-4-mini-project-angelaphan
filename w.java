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
        return (int)(Math.random()*3)+1;
    }
    public void playGame()
    {
        int startingCoins;
        int maxRounds;
        int coins1= startingCoins;
        int coins2= startingCoins;
        int round=1;
        
        while (round<=maxRounds && (coins1>=3 && coins2>=3))
        {
            spend1=getPlayer1Move();
            spend2=getPlayer2Move(round);
            if (spend1==spend2)
            {
                coins2++;
            }
            if (spend1-spend2==1 || spend1-spend2==-1)
            {
                coins2++;
            }
            if (spend1-spend2==2 || spend1-spend2==-2)
            {
                coins2+=2;
            }
            round++;
        }
        String winner;
        if (coins1>coins2)
        {
            winner="Player 1";
        }
        else
        {
            if (coins 2>coins1)
            {
                winner="Player 2";
            }
            else
            {
                winner="tie";
            }
        }
        System.out.print(winner);
    }
}