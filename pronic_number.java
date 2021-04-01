import java.util.*;
public class pronic_number
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int a,n,b,c=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(a=0;a<=n;a++)
        {
            b=a*(a+1);
            if(n==b)
            {
                c=1;
                break;
            }
        }
        if(c==1)
        System.out.println("it is a pronic number");
        else
        System.out.println("it is not a pronic number");
    }
}
        
    


                
        