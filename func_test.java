import java.util.*;
public class func_test
{
    void fnNaturalNumber(int n)
    {
        System.out.println("Enter the limit of the series");
        for(int k=1;k<=n;k++)
        {
            System.out.println("..."+k);
        }
    }
    public void main()
    {
        int num=0;
        Scanner sc= new Scanner (System.in);
        num=sc.nextInt();
        fnNaturalNumber(num);
    }
}
