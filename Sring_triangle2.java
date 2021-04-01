public class Sring_triangle2
{
    public static void main(String s)
    {
        int i,j;
        char x;
        for(i=s.length()-1;i>=0;i--)
        {
            for(j=i;j<=s.length()-1;j++)
            {
                x=s.charAt(j);
                System.out.println(x);
            }
            System.out.println();
        }
    }
}
