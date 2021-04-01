public class reverse_triangle
{
    public static void main()
    {
        for(int i=0;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print((char)(i+65));
            }
            System.out.println("");
        }
    }
}

    