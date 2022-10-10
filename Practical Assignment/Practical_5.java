//Created by Shekhat Krupa (21CE133)
/*
* Practical 5
* According to question no 1, the Account class was defined to model a bank account.  
* An account has the properties account number, balance, annual interest rate, 
* and date  created, and methods to deposit and withdraw funds. Create two subclasses 
* for checking and saving accounts. A checking account has an overdraft limit, 
* but a  savings account cannot be overdrawn.
* 
*/
public class Practical_5 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.setBalance(5400);
        sa.withdraw(200);
        System.out.println("Balance of Saving account= "+sa.getBalance());
        CheckingAccount ca = new CheckingAccount();
        ca.setBalance(10000);
        ca.withdraw(1000);
        
        System.out.println("Balance of checking account= "+ca.getBalance());
        System.out.println("By Shekhat Krupa 21CE133");
    }
}