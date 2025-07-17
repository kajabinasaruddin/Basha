package Assignment_Inheritance_Problems;
public class Programmer_10 extends Employee_10{
    public Programmer_10(){
        details();
    }
    public double bonuses(){
        return 16.0;
    }
    public String generating_performance_report(){
        return "good";
    }
    public String managing_projects(){
        return "Email spam detection";
    }
    void display(){
        dis();
        System.out.println("bonuses :" +bonuses());
        System.out.println("generating_performance_report :" +generating_performance_report());
        System.out.println("managing_projects :" +managing_projects());
    }
}
