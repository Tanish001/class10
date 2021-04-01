public class Selection_Sort
{
    int AR[]={85,50,20,40,60};
    void fnSelectionSort()
    {
        int b=0,sm=0,psm=0,r=0,temp=0,n=5;
        for(b=0;b<=n-2;b++)
        {
            sm=AR[b];
            psm=b;
            for(r=b+1;r<=n-1;r++)
            {
                if(sm > AR[r])
                {
                    sm=AR[r];
                    psm=r;
                }
            }
            temp=AR[b];
            AR[b]=AR[psm];
            AR[psm]=temp;
        }
        System.out.println("The series in ascending order after selection sort is....");
        for(r=0;r<n;r++)
        System.out.println(AR[r]+" ");
    }
}

        
        
        
    