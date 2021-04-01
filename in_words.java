import java.util.*;
public class in_words
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number between 0 to 999");
        int value=sc.nextInt();
        int ones_digit;
        int tens_digit;
        int hundred_digit,remaining;
        String[]one={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourten","fiveteen",
        "sixteen","seventeen", "Eighteen","nineteen"};
        String[]tens={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[]hundred={"","one hundred","two hundred","three hundred","four hundred","five hundred","six hundred","seven hundred","eight hundred",
        "nine hundred"};
        while(value!=-1)
        {
            if(value<20)
            {
                String result=one[value];
                System.out.println(value+" in words: "+result);
            }
            else if(value>20 && value<100)
            {
                tens_digit=value/10;
                ones_digit=value%10;
                System.out.println(value+" in words: "+tens[tens_digit]+" "+one[ones_digit]);
            }
            else if(value>100 && value<1000)
            {
               hundred_digit=value/100; 
               remaining=value%100;
               tens_digit=remaining/10;
               ones_digit=remaining%10;
               System.out.println(value+" in words: "+hundred[hundred_digit]+" "+tens[tens_digit]+" "+one[ones_digit]);
            }
            else
            {
               System.out.println("the input is greater than equals to 1000");
            }
            System.exit(-1);
        }
    }
}
                
            
            
        