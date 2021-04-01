import java.util.*;
public class password_Protected
{
  public static  void check()
  {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your name");
        String a=sc.nextLine();
        System.out.println("All wright! Enter the password to acess in the program:");
        String Real="Blue_the_adorable_labrador";
        String f=sc.nextLine();
        boolean Pass=Real.equals(f);
        
    if(Pass==true)
    {
          System.out.println("Welcome to the program!");
          System.out.println("Hi!I m Tanish...");
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
         System.out.println("It is a special Character");
        }
        }
    else
    {
        System.out.println("Wrong Password");
        System.exit(0);
    }
  }
}
          
        
        