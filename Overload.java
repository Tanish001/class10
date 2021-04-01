import java.util.*;
public class Overload
{
    void area(double b,double p)
    {
        System.out.println(0.5*b*p);
    }
    void area(double r)
    {
        System.out.println(Math.PI*r*r);
    }
    void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        Overload ob= new Overload();
        System.out.println("Enter \n1 to calculate area of the right angle triangle \n2 to calculate the area of the circle");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Enter the length of the base and the perpendicular:");
            double b=sc.nextDouble();
            double p=sc.nextDouble();
            ob.area(b,p);
            break;
            case 2:System.out.println("Enter the length of the radius of the circle");
            double r=sc.nextDouble();
            ob.area(r);
            break;
            default:System.out.println("Wrong input");
        }
    }
}

           
        
        