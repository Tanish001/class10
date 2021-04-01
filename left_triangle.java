public class left_triangle
{
    public static void main()
    {
        for(int i=1,l=5;i<=5;i++,l--)
        {
            char c='A';
            for(int j=1;j<i;j++)
            
                System.out.print(" ");
            
            for(int k=1;k<=l;k++,c++)
            
                System.out.print(c);
            
            System.out.println();
        }
    }
}
