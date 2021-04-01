import java.util.*;
public class swapping_without_third_variable
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the two numbrs to be swapped");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The two numbers before swapping = "+a+" and "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The two numbers after swapping = "+a+" and "+b);
        System.out.println("thanks for helping me for providing the numbers to be swapped");
    }
}
