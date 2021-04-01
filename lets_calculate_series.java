public class lets_calculate_series
{
    public static void main()
    {
        double G=0;
        for(int H=-5;H<=5;H++)
        {
            double num=(H-1)*(H+3);
            double den=(H-2)*(H+4);
            if(den==0)
            G=1;
            else
            G=num/den;
            System.out.println("When H ="+H+ "then G="+G);
        }
    }
}
