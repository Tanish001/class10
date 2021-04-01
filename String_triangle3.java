import java.util.*;
public class String_triangle3
{
    public void main()
    {
         int len,c=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the name");
        String s=sc.nextLine();
        len=(s.length()-1);
        for(int j=len;j>=0;j--)
        {
            for(int i=0;i<=j;i++)
            {
                char x=s.charAt(i);
                System.out.println(x);
            }
            System.out.println();
        }
    }
}        