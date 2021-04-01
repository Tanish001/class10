public class number
{
    int a,b,c;
    number(int x,int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        
        System.out.println(a+" "+b+" "+c);
    }
    void change()
    {
        c=a+b;
    }
    public static void main()
    {
        number ob=new number(5,6);
        ob.show();
        ob.change();
    }
}

        
     
        
            