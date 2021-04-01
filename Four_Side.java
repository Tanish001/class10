public class Four_Side
{
    int length;
    int breadth;
    Four_Side(int s)
    {
        length=breadth=s;
}
    Four_Side(int l, int b)
    {
        length=l;
        breadth=b; 
}
    void display()
    {
    int area;
    area= length*breadth;
    System.out.println("the area is ="+area);
}
public static void main(String args[])
{
    Four_Side ob1=new Four_Side(4);
    Four_Side ob2=new Four_Side(7,5);
    ob1.display();
    ob2.display();
}
}

    
        