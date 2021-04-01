import java.util.*;
public class Factorial
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number for which the factorial is to be taken out");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if (num%i==0)
            {
                System.out.print(i+",");
            }
        }
        System.out.println("are the factors of "+num);
    }
}


 