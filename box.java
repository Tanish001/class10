public class box
{
    int length,breadth,height;
    box(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    void compute()
    {
        int volume;
        volume=length*breadth*height;
        System.out.println("the volume of the box is =" +volume);
    }
}
