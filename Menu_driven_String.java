import java.util.*;
public class Menu_driven_String
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int ch=sc.nextInt();
        String n;
        System.out.println("Enter 1 for printing the name in UPPER CASE:-");
        System.out.println("Enter 2 for printing the name in lower case:-");
        System.out.println("Enter 3 for finding the length of the name");
        System.out.println("Enter your choise");
        switch(ch)
        {
            case 1:
            System.out.println("Enter your name");
            n=sc.nextLine();
            System.out.println("The name in UPPER CASE is:- "+n.toUpperCase());
            break;
            case 2:
            System.out.println("Enter your name");
            n=sc.nextLine();
            System.out.println("The name in lower case is:- "+n.toLowerCase());
            break;
            case 3:
            System.out.println("Enter your name");
            n=sc.nextLine();
            System.out.println("The length of your name is:-"+n.length());
            break;
            default :
            System.out.println("Invalid entry");
        }
    }
}

            
        