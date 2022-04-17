public class Zadanie3
{
    public static void main(String[] args)
    {
        String a = "Apple";
        a = a.toLowerCase();
        String b = "Level";
        b = b.toLowerCase();
        String c = "Racecar";
        c = c.toLowerCase();
        String d = "Backward";
        d = d.toLowerCase();

        StringBuilder reverseA = new StringBuilder(a);
        reverseA.reverse();
        if (a.contentEquals(reverseA))
        {
            System.out.print(("String a jest palindromem\n"));
        }
        else
        {
            System.out.print(("String a NIE jest palindromem\n"));
        }

        StringBuilder reverseB = new StringBuilder(b);
        reverseB.reverse();
        if (b.contentEquals(reverseB))
        {
            System.out.print(("String a jest palindromem\n"));
        }
        else
        {
            System.out.print(("String a NIE jest palindromem\n"));
        }

        StringBuilder reverseC = new StringBuilder(c);
        reverseC.reverse();
        if (c.contentEquals(reverseC))
        {
            System.out.print(("String a jest palindromem\n"));
        }
        else
        {
            System.out.print(("String a NIE jest palindromem\n"));
        }

        StringBuilder reverseD = new StringBuilder(d);
        reverseD.reverse();
        if (d.contentEquals(reverseD))
        {
            System.out.print(("String a jest palindromem\n"));
        }
        else
        {
            System.out.print(("String a NIE jest palindromem\n"));
        }
    }
}
