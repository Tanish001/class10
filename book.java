import java.util.*;
public class book
{
    String name;
    double price,amt;
    Scanner sc=new Scanner(System.in);
    public book()
    {
        name="";
        price=0.0;
        amt=0.0;
    }
    void input()
    {
        System.out.println("Enter the name of the book");
        name=sc.nextLine();
        System.out.println("Enter the price of the book");
        price=sc.nextDouble();
    }
    void calc()
    {
        double dis=0;
        if(price<=1000)
        {
            dis=(price*2)/100;
        }
        else if(price>1000 && price<=3000)
        {
            dis=(price*10)/100;
        }
        else if(price>3000)
        {
            dis=(price*25)/100;
        }
        amt=price-dis;
    }
    void display()
    {
        System.out.println("The name of the book is : "+name);
        System.out.println("the price of the book : "+price);
        System.out.println("The total amount of the book after adding the discount : "+amt);
    }
    public static void main()
    {
        book ob = new book();
        ob.input();
        ob.calc();
        ob.display();
    }
}

        
            
    
        
        