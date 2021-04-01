import java.util.*;
public class word_split
{
    public static void main()
    {
        int len,c=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        System.out.println("Breaking the sentence");
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if (x==' ')
            {
                System.out.println();
            }
            else 
            System.out.print(x);
        }
    }
}
