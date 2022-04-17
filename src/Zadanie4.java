public class Zadanie4
{
    public static void main(String[] args)
    {
        String txt = "Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi.";
        char[] arr = txt.toCharArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (Character.isDigit(txt.charAt(i)))
            {
                sum += Character.getNumericValue(txt.charAt(i));
            }
        }
        System.out.print(sum);
    }
}
