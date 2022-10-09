//Created by Shekhat Krupa (21CE133)
/*
* Practical 3
* Personal Loan Eligibility Criteria for Salaried Applicants is as follows: 
* Eligible Age Group - 21 years to 60 years 
* Minimum Net Monthly Income - Rs. 15,000 
* Minimum Total Work Experience - 1 year 
* Citizenship – Indian 
* Create a class AccountHolder to store above given information entered by a user. Create 5 objects of AccountHolder class and store them in an ArrayList. Display names of account holders , who are eligible to get a loan based on given criteria
*/
import java.util.ArrayList;
import java.util.Scanner;
public class A7Q3 {
	public static void main(String[] args) {
		ArrayList<AccountHolder> obj = new
                ArrayList<AccountHolder>();
        int i = 1;
        while (i < 6) {
            Scanner sc = new Scanner(System.in);
            System.out.println(i+ ". Enter following details :-");
            System.out.print("Name :");
            String name = sc.next();
            System.out.print("Age :");
            int age = sc.nextInt();
            System.out.print("Net monthly Income :");
            double netincome = sc.nextDouble();
            System.out.print("Total work Experience :");
            int exp = sc.nextInt();
            System.out.print("Citizenship :");
            String citizenship = sc.next();
            obj.add(new AccountHolder(name, age, netincome, exp, citizenship));
            i++;
        }
        System.out.println("------------------------------------ --------------");
        for (int j = 1; j < obj.size() + 1; j++) {
            System.out.println("AccHolder " + j + " is " +
                    obj.get(j - 1).eligibility());
        }
		System.out.println("\nBy Shekhat Krupa 21CE133");
	}
}
