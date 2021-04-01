import java.util.*;
public class caps_lows
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence=sc.nextLine();
        int len;
        char c=0;
        int capital=0;
        int small=0;
        len=sentence.length();
        for(int i=0;i<len;i++)
        {
            c=sentence.charAt(i);
            if(Character.isUpperCase(c)==true)
            {
                capital++;
            }
            else if(Character.isLowerCase(c)==true)
            {
                small++;
            }
        }
        System.out.println("The number of letters in capital is = "+capital);
        System.out.println("The number of letters in small is = "+small);
    }
}