import java.util.*;
public class Short_form_2_0
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        String w="",last;
        int i,l;
        char x,y;
        System.out.println("Enter the full name");
        String s=sc.nextLine();
        s=s.trim();
        s=s.toUpperCase();
        s=" . "+s;
        l=s.lastIndexOf(' ');
        last=s.substring(l+1);
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            w=w+s.charAt(i+1)+".";
        }
        w=w+last;
        System.out.println(w);
    }
}

        
        
        
    