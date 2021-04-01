import java.util.*;
public class student
{
    String name;
    int age;
    double m1,m2,m3;
    double average,maximum;
    public student(String n,int Age,double M1,double M2,double M3)
    {
        name= n;
        age=Age;
        m1=M1;
        m2=M2;
        m3=M3;
    }
    void compute()
    {
        average=(m1+m2+m3)/3;
        double max=Math.max(m1,m2);
        maximum =Math.max(max,m3);
    }
    void display()
    {
        System.out.println("The name of the candidate : \t "+name);
        System.out.println("The age of the candidate : \t "+age);
        System.out.println("The marks obtained by the candidate in chemistry : \t "+m1);
        System.out.println("The marks obtained by the candidate in Boilogy : \t "+m2);
        System.out.println("The marks obtained by the candidate in Physics : \t  "+m3);
        System.out.println("The average marks of the candidate : "+average);
        System.out.println("The maximum marks of the candidate : "+maximum);
    }
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("The name of the candidate : \t ");
        String nm=sc.nextLine();
        System.out.println("The age of the candidate : ");
        int ag=sc.nextInt();
        System.out.println("The marks obtained by the candidate in chemistry : ");
        double ma1=sc.nextDouble();
        System.out.println("The marks obtained by the candidate in Boilogy : ");
        double ma2=sc.nextDouble();
        System.out.println("The marks obtained by the candidate in Physics : ");
        double ma3=sc.nextDouble();
        student ob=new student(nm,ag,ma1,ma2,ma3);
        ob.compute();
        ob.display();
    }
}
