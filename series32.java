public class series32
{
    public static void main(int n)
    {
        int x=1;
        int sq=0;
        int s=0;
        while(sq<n)
        {
        sq=(x*x)-1;
        s=s+sq;
        x++;
        }
        System.out.println(s);
    }
}