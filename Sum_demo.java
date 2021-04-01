public class Sum_demo
{
    int n;
    static int sum;
    static int count;
    static float average;
static 
{
sum=count=0;
}
Sum_demo(int p)
{
n=p;
}
void addIt ()
{
sum+=n;
count++;
}
static void calculate()
{
average=(float)sum/count;
}
static void showAverage()
{
System.out.println (average);
}
public static void main()
{
    Sum_demo ob1=new Sum_demo(5);
    Sum_demo ob2=new Sum_demo(5);
    Sum_demo ob3=new Sum_demo(5);
    ob1.addIt();
    ob2.addIt();
    ob3.addIt();
    calculate();
    showAverage();
}
}
