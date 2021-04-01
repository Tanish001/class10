import java.util.*;
public class kaprekar_number
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int a,b,c=0,d,e=0,f=0,n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        b=n;
        a=n*n;
        while(n>0)
        {
            c++;
            n=n/10;
            d=(int)Math.pow(10,c);
            e=a/d;
            f=a%d;
        }
        if(e+f==b)
        System.out.println("It is a kaprekar number");
        else
        System.out.println("It is not a kaprekar number");
    }
} 
        
    


            
        