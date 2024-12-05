public class Main
{
	public static void main(String[] args)
    {

    }
    public static boolean isSelfDivisor(int number)
    {   
        int n = number;
        while (number>0)
        {
            int digit=number%10;
            if (digit==0)
            {
                return false;
            }
            if (n%digit!=0)
            {
                return false;
            }
            number/=10
        }
        return true;
        
    }
}