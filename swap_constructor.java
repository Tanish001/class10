public class swap_constructor
{
    int a,b;
    swap_constructor(int x,int y)
    {
        a=x;
        b=y;
    }
    void change()
    {
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println(a+" "+b);
    }
}
