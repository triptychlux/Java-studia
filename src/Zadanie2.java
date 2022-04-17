public class Zadanie2
{
    public static void main(String[] args)
    {
        String word = "AbcQwe";
        char[] reverse = word.toCharArray();
        for (int i = reverse.length - 1; i >= 0; i--)
        {
            System.out.print(reverse[i]);
        }
    }
    }

