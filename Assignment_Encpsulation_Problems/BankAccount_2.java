package Assignment_Encpsulation_Problems;
import java.util.Scanner;
public class BankAccount_2 {
    private int accountNumber;
    private int balance;
    public BankAccount_2(int accountNumber,int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;}
    public int getAccountNumber() {
        return accountNumber;}
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;}
    public int getBalance() {
        return balance;}
    public void setBalance(int balance) {
        this.balance = balance;}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account number :");
        int accountNumber =sc.nextInt();
        System.out.println("enter current balance :");
        int balance=sc.nextInt();
        BankAccount_2 obj=new BankAccount_2(accountNumber,balance);
        System.out.println("display the account Number and Balance :");
        System.out.println(obj.getAccountNumber());
        System.out.println(obj.getBalance());}
}
