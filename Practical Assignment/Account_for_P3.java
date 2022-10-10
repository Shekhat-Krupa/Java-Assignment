import java.util.*;
class Account_for_P3{
    static int count=0;
    private String accountID;
    private double accountBalance=300;
    private double annualInterestRate=0.07;
    private Date dateCreated;
    Scanner sc;
 
    Account_for_P3(){
        count++;
        if(count >= 10) {
            accountID = "AC0" + (count);
 
        }
        else {
            accountID = "AC00" + (count);
        }
        accountBalance = 300;
        annualInterestRate = 0.07;
        dateCreated = new Date();
        sc=new Scanner(System.in);
    }
    void AccountDetail() {
        System.out.println("Account ID : " + accountID);
        System.out.println("Balance : " + accountBalance);
        System.out.println("Interest Rate : " + annualInterestRate);
        System.out.println("Date and Time when account was created : " + dateCreated);
        System.out.println("Current Date and Time : " + new Date());
    }
    void balanceInquiry() {
        //AccountDetail();
        System.out.println("Account " +accountID+ "\nBalance : " +accountBalance+ "\nAccount Created on " +dateCreated+ "\nCurrent date" + new Date());
    }
    int setbalance() {
        System.out.print("Enter  account Balance : ");
        double money = sc.nextDouble();
        if(money >= 300) {
            accountBalance=money;
            return 1;
        }
        else {
            System.out.println("Enter balance greater than or equal to 300 Rs");
            return 0;
        }
    }
    double getannualInterest() {
        return accountBalance*annualInterestRate;
    }
    void withdrawMoney(double money) {
        if(accountBalance>=300 && accountBalance-money>=300) {
            accountBalance-=money;
            System.out.println("Amount of Rs. "+ money +" withdrawn Successfully.");
            System.out.println("Current amount is : " +accountBalance);
        }
        else {
            System.out.println("Not enough fund is available.");
        }
    }
    void depositMoney(double money) {
        accountBalance+=money;
    }
    String getAccountID() {
        return accountID;
    }
    //sc.close();
}
 