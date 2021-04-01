import java.util.*;
public class Short_form
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the name");
        String s= sc.nextLine();
        System.out.println("Short form");
        System.out.print(s.charAt(0));
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x==' ' && s.charAt(i+1)!=' ')
            System.out.print(s.charAt(i+1));
        }
    }
}