public class Zadanie5
{
    public static void main(String[] args)
    {
        String a = "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))";
        String b = "2 * (3.4 - (-7/2)*(a-2)/(b-1))";
        char open = '(';
        char close = ')';
        int count = 0;

        //string A check
        for(int i = 0; i < a.length(); i++)
        {
            if (a.charAt(i)==open)
            {
                count++;
            }
            if (a.charAt(i)==close)
            {
                count--;
            }
        }
        if (count==0)
        {
            System.out.print("OK");
        }
        else
        {
            System.out.print("NOT OK");
        }

        System.out.print("\n");
        count = 0;

        //string B check
        for(int i = 0; i < b.length(); i++)
        {
            if (b.charAt(i)==open)
            {
                count++;
            }
            if (b.charAt(i)==close)
            {
                count--;
            }
        }
        if (count==0)
        {
            System.out.print("OK");
        }
        else
        {
            System.out.print("NOT OK");
        }
    }
}
