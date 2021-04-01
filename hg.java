public class hg
{
    public static void main()
    {
        StringBuffer a=new StringBuffer("Computer");
        StringBuffer b=new StringBuffer(" Science");
        StringBuffer c=new StringBuffer("commuter");
        c.setCharAt(3,'p');
        StringBuffer d= new StringBuffer("Holy School");
        StringBuffer e= new StringBuffer(" Angel's ");
        d.insert(5,e);
        StringBuffer f=new StringBuffer("Computer");
        f.delete(3,6);
        System.out.println(f);
        System.out.println(c);
        System.out.println(d);
        System.out.println("String = "+a.append(b));
    }
}

    
        