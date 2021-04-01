import java.util.*;
public class Marks
{
    String name;
    int age;
    int m1,m2,m3;
    double avg,Max;
    Marks(String n,int a,int M1,int M2,int M3,double average,double Maximum)
    {
        name=n;
        age=a;
        m1=M1;
        m2=M2;
        m3=M3;
        avg=average;
        Max=Maximum;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your age");
        age=sc.nextInt();
        System.out.println("Enter the marks of your first subject");
        m1=sc.nextInt();
        System.out.println("Enter the marks of your second subject");
        m2=sc.nextInt();
        System.out.println("Enter the marks of your third subject");
        m3=sc.nextInt();
    }
    void compute()
    {
        avg=(m1+m2+m3)/3.0;
        Max=Math.max(m1,(Math.max(m2,m3)));
    }
    void display()
    {
        System.out.println("The name of the student: "+name);
        System.out.println("The age of the student: "+age);
        System.out.println("The marks of your first subject = "+m1);
        System.out.println("The marks of your second subject = "+m2);
        System.out.println("The marks of your third subject = "+m3);
        System.out.println("The average of the three marks = "+avg);
        System.out.println("The maximum of the three marks = "+Max);
    }
    public static void main(String args[])
    {
        Marks ob=new Marks("Tanish",15,89,90,97,89,97);
        ob.input();
        ob.compute();
        ob.display();
    }
}

        