import java.util.*;
public class Railway_Ticket
{
    String name;
    String coach;
    long mobno;
    int amt,totalamt;
    public Railway_Ticket()
    {
        name="";
        coach="";
        mobno=0000;
        totalamt=0;
    }
    void accept()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the name : ");
        name=sc.nextLine();
        System.out.println("Enter the train coach type : ");
        coach=sc.nextLine();
        System.out.println("Enter your mobile number : ");
        mobno=sc.nextLong();
        System.out.println("Enter the amount of the ticket as per the chart : ");
        amt=sc.nextInt();
    }
    void calc()
    {
        if(coach.equals("First tier AC"))
        {
            totalamt = amt+700;
        }
        else if(coach.equals("Second tier AC"))
        {
            totalamt = amt+500;
        }
        else if(coach.equals("Non AC slepper"))
        {
            totalamt=amt;
        }
    }
    void display()
    {
        System.out.println("Name of the passenger : "+name);
        System.out.println("The coach type of the passenger : "+coach);
        System.out.println("Registered mobile number of the passenger : "+mobno);
        System.out.println("The cost for reserving the seat : "+amt);
        System.out.println("Total amount after calculating the extra charges : "+totalamt);
    }
    void main()
    {
        Railway_Ticket ob=new Railway_Ticket();
        ob.accept();
        ob.calc();
        ob.display();
    }
}

        
        
    