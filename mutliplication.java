import java.util.*;
public class mutliplication
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,s=0;
        System.out.println("Enter the number of which you want the table for: ");
        a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            s=a*i;
            System.out.println(a+"x"+i+"="+s);
        }
    }
}

        