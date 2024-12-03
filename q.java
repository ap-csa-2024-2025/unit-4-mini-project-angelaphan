public class Main
{
	public static void main(String[] args)
    {

    }
    public static void longestStreak(String str)
    {
        int count=1;
        int max;
        String L;
        for (int i=0; i<str.length();i++;)
        {
            String letter=str.substring(i,i+1);
            
            if (i==0)
            {
                L=letter;
            }
            else
            {
                String behind=str.substring(i-1,i);
                if (letter.equals(behind))
                {
                    count++;
                }
                else
                {
                    if (count>max)
                    {
                        max=count;
                        L=letter;
                    }
                    count=1;
                }
                }
            
        }
        
    }
}