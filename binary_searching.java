import java.util.*;
public class binary_searching
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,k=0,p=0,ns=0,lb=0,ub=0;
        int m[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the number :");
            m[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched :");
        ns=sc.nextInt();
        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if(m[p]<ns)
            lb=p+1;
            if(m[p]>ns)
            ub=p-1;
            if(m[p]==ns)
            {
                k=1;
                break;
            }
        }
        if(k==1)
        {
            System.out.println("The search is successful and the number is present");
        }
        else
        {
            System.out.println("The search is unsuccessful and the number is not present");
        }
    }
}
        
            