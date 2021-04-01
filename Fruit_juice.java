public class Fruit_juice
{
    double product_code;
    String flavour;
    String packtype;
    int pack_size;
    int product_price;
    int Finalprice;
    Fruit_juice()
    {
       product_code=0; 
       pack_size=0;
       product_price=0;
       flavour="";
       packtype="";
    }
    void input(double PC,int PS,int Pp,String F,String p)
    {
       product_code=PC; 
       pack_size=PS;
       product_price=Pp;
       flavour=F;
       packtype=p;
    }
    void discount()
    {
        
        Finalprice=product_price-10;
    }
    void display()
    {
        System.out.println("the product code is: "+product_code);
        System.out.println("the flavour of the juice is: "+flavour);
        System.out.println("the pack type you asked for: "+packtype);
        System.out.println("the quantity of the product: "+pack_size);
        System.out.println("the actual price of the product is: "+product_price);
        System.out.println("the final price after giving discount is = "+ Finalprice);
        System.out.println("Thank you for shopping,please visit us again");
    }
    public static void main(String args[])
    {
        Fruit_juice ob1=new Fruit_juice();
        Fruit_juice ob2=new Fruit_juice();
        ob1.input(2.13,7,6,"orange","tetra pack");
        ob2.discount();
    }
}

        