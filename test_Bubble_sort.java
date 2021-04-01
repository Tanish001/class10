public class test_Bubble_sort
{
    int Ar[]={23,12,32,10,87};
    int n=5;
    void fnBubbleSort()
    {
        int s,j,temp,r;
        for(s=1;s<=n-1;s++)
        {
            for(j=0;j<=n-1-s;j++)
            {
                if(Ar[j]>Ar[j+1])
                {
                    temp=Ar[j];
                    Ar[j]=Ar[j+1];
                    Ar[j+1]=temp;
                }
            }
        }
        System.out.println("The series in Ascending order after Bubble sort...");
        for(r=0;r<=n-1;r++)
        System.out.println(Ar[r]+" ");
    }
}
           
        
        
                
        