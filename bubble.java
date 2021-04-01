public class bubble
{
    public static void main()
    {
        int i,j,temp=0;
        int a[]={45,5,6,2,32,65,98,12,51,58};
        for(i=a.length-1;i>0;i--)
        for(j=0;j<i;j++)
        {
           if(a[j]>a[j+1])
           {
             a[j]=a[j+1];
             a[j+1]=temp;
             temp=a[j];
           }
        }
        System.out.println("The sorted array is:");
        for(i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
}