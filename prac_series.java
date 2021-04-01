import java.util.*;
public class prac_series
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int n;
        double s=0.0;
        System.out.println("Enter the limit of the series: ");
        n= sc.nextInt();
        for (int i=1;i<=n;i++)
        
            s=s+Math.pow(i,3);
            System.out.println("Sum is: "+s);
    }
}
