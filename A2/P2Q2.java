//Created by Shekhat Krupa (21CE133)
/*
 * Practical 2
 * Design a class named Account that contains:
● A private int data field named id for the account (default 0).
● A private double data field named balance for the account (default 500₹).
● A private double data field named annualInterestRate that stores the 
current interest rate (default 7%). Assume all accounts have the same 
interest rate.
● A private Date data field named dateCreated that stores the date when the 
account was created.
● A no-arg constructor that creates a default account.
● A constructor that creates an account with the specified id and initial balance.
● The accessor and mutator methods for id, balance, and annualInterestRate.
● The accessor method for dateCreated.
● A method named getMonthlyInterestRate() that returns the monthly interest rate.
● A method named getMonthlyInterest() that returns the monthly interest.
● A method named withdraw that withdraws a specified amount from the account.
 */
//package Part2;

public class P2Q2 {
	public static void main(String args[]) {
		AccountQ1 a1=new AccountQ1();
		AccountQ1 a2=new AccountQ1(1,2000,10);
		
		double mi1,mir1,mi2,mir2;
		mi1=a1.getMonthlyInterest();
		mir1=a1.getMonthlyInterestRate();
		mi2=a2.getMonthlyInterest();
		mir2=a2.getMonthlyInterestRate();
		
		System.out.println("Monthly Interest of dafoult constructor : Rs." +mi1);
		System.out.println("Monthly Interest Rate of dafoult constructor : " +mir1+"%");
		System.out.println("Monthly Interest of Parameterized constructor : Rs." +mi2);
		System.out.println("Monthly Interest Rate of Parameterized constructor : " +mir2+"%");
		System.out.println("By Shekhat Krupa 21CE133");
		
	}
}
