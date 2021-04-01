public class Salary_calculation
{
    String name;
    double bas,specialalw,conveyancealw,gross,pf,NetSalary,AnnualSal;
    Salary_calculation()
    {
        name="Tanish";
        bas=20000;
        conveyancealw=1000;
    }
    void Salarycal()
    {
        specialalw=25*bas/100;
        pf=11*bas/100;
        gross=bas+specialalw+conveyancealw;
        NetSalary=gross-pf;
        AnnualSal=12*NetSalary/100;
    }
    void display()
    {
        System.out.println("name:"+name);
        System.out.println("Basic pay= "+bas);
        System.out.println("Net Salary"+NetSalary);
        System.out.println("Annual Salary"+AnnualSal);
    }
    static void main()
    {
        Salary_calculation ob=new Salary_calculation();
        ob.Salarycal();
        ob.display();
    }
}

       
        
        
    
    