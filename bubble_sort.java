public class bubble_sort
{
    public static void main()
    {
        int i,j,c;
        int a[]={5,3,8,9,2,1,12,98,16,4};
        System.out.println(a.length);
        for(i=a.length-1;i>0;i--)
        for(j=0;j<i;j++)
        {
            if(a[j]>a[j+1])
            {
                c=a[j];
                a[j]=a[j+1];
                a[j+1]=c;
            }
        }
        System.out.println("Ascending order .......");
        for(i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
}

            
         