public class prime_check
{
    public static boolean main(int a)
    {
       int flag=1;
       if(a==1)
       return false;
       for(int k=2;k<a;k++)
       {
           if(a%k==0)
           flag++;
       }
       if(flag==1)
       return true;
       else
       return false;
    }
}
       
        