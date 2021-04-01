import java.util.*;
public class title_case
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        int i;
        char x,y;
        String t="",w="";
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        s=s.trim();
        s=s.toLowerCase();
        s=s+" ";
        for(i=0;i<s.length();i++)
        {
            x=s.charAt(i);
            if(x!=' ')
            w=w+x;
            else
            {
                y=w.charAt(0);
                y=Character.toUpperCase(y);
                w=y+w.substring(1);
                t=t+w+" ";
                w="";
            }
        }
        System.out.println(t);
    }
}

            
        