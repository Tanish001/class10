import java.util.*;
public class first_last_word
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s,first,last;
        int i;
        System.out.println("Enter the sentence");
        s=sc.nextLine();
        s=s.trim();
        i=s.indexOf(" ");
        first=s.substring(0,i);
        i=s.lastIndexOf(" ");
        last=s.substring(i+1);
        System.out.println("First word : "+first);
        System.out.println("last word : "+last);
    }
}

