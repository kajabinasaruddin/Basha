package Assignment_Inheritance_Problems;
public class Manager_10 extends Employee_10{
    public Manager_10(){
        details();
    }
    public double bonuses(){
        return 15.0;
    }
    public String generating_performance_report(){
        return "Excellent";
    }
    public String managing_projects(){
        return "Email spam classification";
    }
    void display(){
        dis();
        System.out.println("bonuses :" +bonuses());
        System.out.println("generating_performance_report :" +generating_performance_report());
        System.out.println("managing_projects :" +managing_projects());
    }
}
