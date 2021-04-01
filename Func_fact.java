import java.util.*;
public class Func_fact
{
    public int factorial(int nf)
    {
        int pr=1;
        for(int k=1;k<=nf;k++)
        {
            pr=pr*k;
        }
        return pr;
    }
    public void main()
    {
        int res=0,n=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        res=factorial(n);
        System.out.println("The factorial of "+n+" = "+res);
    }
}

    
            
            