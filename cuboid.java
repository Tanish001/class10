class cuboid
{
    double width;
    double height;
    double length;
    cuboid () //constructor with no parameter,
    {
        width=0;
        height=0;
        length=0;
    }
    cuboid (double n) //constructor with single parameter.
    {
        width=length=height=n;
    }
    cuboid (double w,double h,double l) //constructor with three parameter.
    {
        width=w;
        height=h;
        length=l;
    }
    void displayvolume()
    {
        double vol;
        //compute volume,
        vol=width*length*height;
        System.out.println("the volume is = "+vol);
    }
    static void createobjects()
    {
        cuboid mycuboid1=new cuboid();
        //calls the first constructor version.
        cuboid mycuboid2=new cuboid();
        //calls the second constructor version.
        cuboid mycuboid3=new cuboid();
        //calls the third constructor version.
        mycuboid1.displayvolume();
        mycuboid2.displayvolume();
        mycuboid3.displayvolume();
    }
}

        
        
        
        
        
    
        