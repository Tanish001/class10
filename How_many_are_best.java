import java.util.*;
public class How_many_are_best
{
    public static void main()
    {
        int m=0,ns=0;
        Scanner sc=new Scanner (System.in);
        for (int i=1;i<=10;i++)
        {
            System.out.println("enter the marks of the student number "+i+":");
            m=sc.nextInt();
            if(m>=80)
            {
                ns=ns+1;
            }
        }
        System.out.println("the number of students who scored more than or equals to 80 are:"+ns);
    }
}