import java.util.*;
public class swapping_with_third_variable
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers which are needed to be swapped");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t;
        System.out.println("The two numbers before swapping = "+a+" and "+b);
        t=a;
        a=b;
        b=t;
        System.out.println("The two numbers after swapping = "+a+" and "+b);
        System.out.println("thanks for helping me for providing the numbers to be swapped");
    }
}
