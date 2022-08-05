//Created by Shekhat Krupa (21CE133)
/*Practical : 4
 * 		(Subclasses of Account) In Programming Exercise 2, the Account class was defined to model a bank account.
        An account has the properties account number, balance, annual interest rate, and date created,
        and methods to deposit and withdraw funds. Create two subclasses for checking and saving accounts.
        A checking account has an overdraft limit, but a savings account cannot be overdrawn. Draw the UML diagram for the
        classes and then implement them. Write a test program that
        creates objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.*/
//package Part2;
    
    
    
    class P2Q4
    {
        public static void main(String[] args)
        {
            //Account a1=new Account();
            Account a2=new Account(56,150000);
            a2.setdata(56,150000,5.6,"3-8-2022");
            System.out.println("Account Details: ");
            System.out.println("Balance : "+a2.balance);
            System.out.println("Annual Interest : "+a2.getAnn());
            System.out.println("Monthly Interest Rate : "+a2.getMonthlyInterestRate());
            System.out.println("Monthly Interest : "+a2.getMonthlyInterest());
            System.out.println("Account was created on : "+a2.getDt());
            a2.withdraw(12000);
            a2.deposit(15000);
            System.out.print("\n\n");
            SavingAccount a=new SavingAccount(900);
            CheckingAccount b=new CheckingAccount(1000);
            System.out.println("For Saving Account : ");
            System.out.println(a);
            System.out.print("------------------------\n");
            System.out.println("For Checking Account : ");
            System.out.println(b);
            System.out.println("By Shekhat Krupa 21CE133");
        }
    }
