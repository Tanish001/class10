import java.util.*;
public class String_name
{
    public static void main()
    {
        int b,d;char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String a=sc.nextLine();
        d=a.length();
        for(b=0;b<d;b++)
        {
            c=a.charAt(b);
            System.out.println("The "+b+" th word is = "+c);
        }
    }
}
