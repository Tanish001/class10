import java.util.*;
public class Happy_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,n,b,c=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        c=n;
        do
        {
            n=c;
            c=0;
           do
           {
            a=n%10;
            c=c+(a*a);
            n=n/10;
           }while(n>0);
        }while(c>9);
        if(c==1)
        System.out.println("Happy number");
        else
        System.out.println("Not a happy number");
    }
}

            