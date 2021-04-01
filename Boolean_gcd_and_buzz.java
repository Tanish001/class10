import java.util.*;
public class Boolean_gcd_and_buzz
{
    static boolean isBinary(int b)
    {
        int d,f=0;
        while(b!=0)
        {
            d=b%10;
            if(d!=1 && d!=0)
            {
                f=1;
                b=b/10;
            }
        }
        if(f==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static int binToDecimal(int b)
    {
        int s=0,d,c=0;
        while(b!=0)
        {
            d=b%10;
            s=s+d*(int)Math.pow(2,c++);
            b=b/10;
        }
        return s;
    }
    static int deciToBinary(int d)
    {
        int s=0,b,c=0;
        while(d!=0)
        {
            b=d%2;
            s=s+b*(int)Math.pow(10,c++);
            d=d/2;
        }
        return s;
    }
    static void sum()
    {
        Scanner sc =new Scanner (System.in);
        int b1,b2,d1,d2,b,d;
        System.out.println("Input two valid binary numbers");
        b1=sc.nextInt();
        b2=sc.nextInt();
        if(isBinary(b1)==true && isBinary(b2)==true)
        {
            d1=binToDecimal(b1);
            d2=binToDecimal(b2);
            d=d1+d2;
            b=deciToBinary(d);
            System.out.println("The sum of the two binary numbers: "+b);
        }
        else
        {
            System.out.println("The binary numbers may not be valid!!...");
        }
    }
}

            
        