import java.util.*;
public class first_last
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        String s,t="",w="";
        int i;
        char x,y,z;
        System.out.println("Enter the sentence");
        s=sc.nextLine();
        s=s.trim();
        s=s.toLowerCase();
        s=s+" ";
        for(i=0;i<s.length();i++)
        {
            x=s.charAt(i);
            if (x!=' ')
            w=w+x;
            else
            {
                y=w.charAt(0);
                z=w.charAt(w.length()-1);
                if(y==z)
                t=t+w+" ";
                w="";
            }
        }
        System.out.println(t);
    }
}
