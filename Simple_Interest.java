import java.util.*;
public class Simple_Interest
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the principal");
        double P=sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double R=sc.nextDouble();
        System.out.println("Enter the time period");
        double T=sc.nextDouble();
        double si=(P*R*T)/100;
        System.out.println("The interest for your principal =" +P+ " at the certain rate of " +R+" % for a stipulated time period of " +T+ " month(s) or year(s) is= " +si);
        double A =P+si;
        System.out.println("The amount is =" +A);
    }
}
