import java.util.*;
public class fibonacci_series
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the limit of the series");
        int n= sc.nextInt();
        int a=1,b=1,s=0;
        System.out.print("The series is: "+a+" "+b);
        for(int i=3;i<=n;i++)
        {
            s=a+b;
            System.out.print(s+" ");
            a=b;
            b=s;
        }
    }
}
