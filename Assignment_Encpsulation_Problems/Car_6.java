package Assignment_Encpsulation_Problems;
import java.util.Scanner;
public class Car_6 {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;
    public  Car_6(String company_name,String model_name,int year,double mileage){
        this.company_name=company_name;
        this.model_name=model_name;
        this.year=year;
        this.mileage=mileage;}
    public String getCompany_name() {
        return company_name;}
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public String getModel_name() {
        return model_name;
    }
    public void setModel_name(String model_name) {
        this.model_name = model_name;}
    public int getYear() {
        return year;}
    public void setYear(int year) {
        this.year = year;}
    public double getMileage() {
        return mileage;}
    public void setMileage(double mileage) {
        this.mileage = mileage;}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter company name :");
        String company_name=sc.nextLine();
        System.out.println("enter model name :");
        String model_name=sc.nextLine();
        System.out.println("enter year :");
        int year=sc.nextInt();
        System.out.println("enter mileage :");
        double mileage=sc.nextDouble();
        Car_6 obj=new Car_6(company_name,model_name,year,mileage);
        System.out.println(obj.getCompany_name());
        System.out.println(obj.getModel_name());
        System.out.println(obj.getYear());
        System.out.println(obj.getMileage());}}
