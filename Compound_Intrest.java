import java.util.*;
public class Compound_Intrest
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
        double A=Math.pow(P*((1+R)/100),T);
        double Ci=A-P;
        System.out.println("The interest for your principal =" +P+ " at the certain rate of " +R+" % for a stipulated time period of " +T+ " month(s) or year(s) is= "+Ci);
        System.out.println("The amount is = "+A);
    }
}
