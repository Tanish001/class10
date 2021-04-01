import java.util.*;
public class vowel2
{
    public static void main()
    {
       Scanner sc=new Scanner (System.in);
       String s,t="",w="";
       int i;
       char x,y;
       System.out.println("Enter the sentence");
       s=sc.nextLine();
       s=s.trim();
       s=s.toLowerCase();
       s=s+"";
       for(i=0;i<s.length();i++)
       {
           x=s.charAt(i);
           if(x!=' ')
           {
               w=w+x;
            }
           else
           {
               y=w.charAt(0);
               if(y=='a' || y=='A' || y =='e' || y =='E' || y =='i' || y =='I' || y =='o' || y =='O' || y =='u' || y =='U')
               t=t+w+" ";
               w="";
            }
        }
        System.out.println(t);
    }
}

           
       
       
       
       
 