import java.util.*;
public class pallindrome
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int b=0,c,d,n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        d=n;        //garbage value.
        while(n>0)
        {
            c=n%10;     //last value.
            b=(b*10)+c; //iteration proces.
            n=n/10;     //first value.
        }
        if(b==d)
        {
            System.out.println("Pallindrome number");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }
    }
}
            
        
