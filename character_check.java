import java.util.*;
public class character_check
{
    public static void main()
    {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter one character");
    char chr=sc.next().charAt(0);
    if(Character.isLetter(chr)==true)
    {
        System.out.println(chr+" is a letter!");
        if(Character.isUpperCase(chr)==true)
        System.out.println(chr+" is in upper case!");
        if(Character.isLowerCase(chr)==true)
        System.out.println(chr+" is in lower case!");
    }
    else if(Character.isDigit(chr))
    {
    System.out.println(chr+" is a digit!");
    }
    else
    {
    System.out.println("It is a special character");
    }
    }
}

    


            



            
        
        
        