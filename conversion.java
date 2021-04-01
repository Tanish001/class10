public class conversion
{
    static int mTocm(int m)
    {
        return m*100;
    }
    static int multiply(int x,int y)
    {
        return x*y;
    }
    public class rectangle
    {
        int length,breadth;
        rectangle(int l,int b)
        {
            length=l;
            breadth=b;
        }
        void convert()
        {
            length=conversion.mTocm(length);
        }
        void compute()
        {
            int area;
            convert();
            area=conversion.multiply(length,breadth);
            System.out.println("area= "+area);
        }
    }
}

           
            
    