import java.util.*;
public class Switch_gcd_buzz
{
    public static void main()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter 1 for Buzz no.");
        System.out.println("Enter 2 for GCD");
        System.out.println("So,lets go for it, Enter your choise");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1:System.out.println("Enter a numerical value");
        int a =sc.nextInt();
        if(a%10==0 && a%7==0)
        System.out.println("It is a buzz number");
        else 
        System.out.println("It is not a buzz number");
        break;
        case 2:System.out.println("Enter two numbers");
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=Math.min(b,c);
        double e=Math.max(b,c);
        double f=0;
        while(d>0)
        {
            f=e%d;
            if(f==0)
            break;
            else
            d--;
            continue;
        }
        System.out.println(d);
        break;
        default :System.out.println("Wrong choise");
        break;
    }
}
}