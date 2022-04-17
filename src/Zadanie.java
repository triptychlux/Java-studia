public class Zadanie
{
    public static void main(String[] args)
    {
        String abra = "Abrakadabra";
        int last = abra.length();
        char lastCh = abra.charAt(last-1);
        int count = 0;
        for(int i = 0; i < abra.length(); i++)
        {
            if (abra.charAt(i)==lastCh)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}

