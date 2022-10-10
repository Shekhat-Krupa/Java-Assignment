//Created by Shekhat Krupa (21CE133)
/*
* Practical 1
* Design a class named Account that contains:  
 A private int data field named id for the account (default 0).  
 A private double data field named balance for the account (default 0) 
 A private double data field named annualInterestRate that stores the current interest rate (default 0). Assume that all accounts have the same interest rate.  ∙ A private Date data field named dateCreated that stores the date when the  account was created. 
 A no-arg constructor that creates a default account. 
 A constructor that creates an account with the specified id and initial balance. ∙ The accessor and mutator methods for id, balance and annualInterestRate. ∙ The accessor method for dateCreated. 
 A method named getMonthlyInterestRate() that returns the monthly interest  rate. 
 A method named getMonthlyInterest() that returns the monthly interest. 
 A method named withdraw that withdraws a specified amount from the  account.  
 A method named deposit that deposits a specified amount to the account

*/
import java.util.*;
public class Practical_1 {
	public static void main(String []argc) {
		Scanner sc = new Scanner(System.in);
        Account a = new Account();
        System.out.println();
        System.out.println("The Account Creation Date is : ");
        System.out.println(a.date.toString());
        System.out.println();
        boolean flag=true;
        		while(flag==true) {
        			int x;
        			System.out.println("\nChoice \t\t\t choice No");
        			System.out.println("Deposit inquiry \t:  1");
        			System.out.println("Withdraw money \t\t:  2");
        			System.out.println("InterestRate \t\t:  3");
        			System.out.println("To end \t\t\t:  0");
        			System.out.print("Enter the number as per following choice : ");
        			x=sc.nextInt();
        			System.out.println();
        			if(x<=0 && x>4)continue;
        			else if (x==7)break;
        			switch(x) {
        					case 1:
        						a.deposit();
        						break;
        					case 2:
        						a.withdraw();
        						break;
        					case 3:
        						a.getMonthlyInterestRate();
        						break;
        					case 0:
        						flag=false;
        						break;
        				
        			}			
        		}
        		System.out.println("By Shekhat Krupa 21CE133");
        sc.close();
    }

}
