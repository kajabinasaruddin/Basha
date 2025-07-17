package Assignment_Inheritance_Problems;
public class Developer_10 extends Employee_10{
    public Developer_10(){
        details();
    }
    public double bonuses(){
        return 18.0;
    }
    public String generating_performance_report(){
        return "not good";
    }
    public String managing_projects(){
        return "Email spam classification and detection";
    }
    void display(){
        dis();
        System.out.println("bonuses :" +bonuses());
        System.out.println("generating_performance_report :" +generating_performance_report());
        System.out.println("managing_projects :" +managing_projects());
    }
}
