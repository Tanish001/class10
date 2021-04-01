import java.util.*;
public class compositive_smallest_number
{
    static void isCompositive(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c>=1)
        System.out.println("It is a compositive number");
        else
        System.out.println("it is not compositive number");
    }
    static void Smallest(int n)
    {
        int d=0,s=n%10;
        while(n!=0)
        {
            d=n%10;
            if(d<s)
            s=d;
            n=n/10;
        }
        System.out.println("It is a smallest digit is: "+s);
    }
    static void menu()
    {
        Scanner sc =new Scanner (System.in);
        int n,ch;
        System.out.println("Enter 1 for compositive number:");
        System.out.println("Enter 2 for finding the smallest digit of the given number:");
        System.out.println("Enter your choise");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter the number");
            n=sc.nextInt();
            isCompositive(n);
            break;
            case 2:
            System.out.println("Enter the number");
            n=sc.nextInt();
            Smallest(n);
            break;
            default:
            System.out.println("Invalid entry");
        }
    }
}
