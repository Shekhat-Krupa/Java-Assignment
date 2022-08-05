//Created by Shekhat Krupa (21CE133)
/*
 *Practical 3
 *Use the Account class created as above to simulate an ATM machine. 
Create 10 accounts with id AC001….AC010 with initial balance 300₹. The system 
prompts the users to enter an id. If the id is entered incorrectly, ask the user to enter 
a correct id. Once an id is accepted, display menu with multiple choices.
1. Balance inquiry
2. Withdraw money [Maintain minimum balance 300₹]
3. Deposit money
4. Money Transfer
5. Create Account
6. Deactivate Account
7. Exit
Hint: Use ArrayList, which is can shrink and expand with compared to Array 
 */
// package Part2;
import java.util.*;

public class P2Q3 {
	static int getIndex(ArrayList<AccountQ2> persons) {
		
		String ID=null;
		int i=0;
		boolean flag = true;
		//@SuppressWarnings("resource")
		
		System.out.print("Enter ID of the account : ");
		for(i=0;i<persons.size()+1;i++) {
			if(flag) {
				Scanner sc1 = new Scanner (System.in);
				ID=sc1.next();
				i=0;
				flag=false;
				sc1.close();
			}
			else if(i==persons.size()) {
				System.out.println("No account found.");
				flag=true;
				i=0;
				break;
			}
			if(ID.equals(persons.get(i).getAccountID())) {
				System.out.println("Account ID " + persons.get(i).getAccountID()+ "Found");
				break;
			}
		}
		return i;
		
	}
	public static void main(String argc[]) {
		ArrayList<AccountQ2> persons = new ArrayList<AccountQ2>();
		boolean flag=true;
		double money;
		int i;
		for(i=0;i<10;i++) {
			AccountQ2 a=new AccountQ2();
			persons.add(a);
		}
		for(i=0;i<10;i++) {
			persons.get(i).AccountDetail();
		}
		int x;
		Scanner sc2=new Scanner(System.in);
		while(flag==true) {
			
			System.out.println("\nChoice \t\t\t choice No");
			System.out.println("Balance inquiry \t:  1");
			System.out.println(" Withdraw money \t:  2");
			System.out.println("Deposit money \t:  3");
			System.out.println("Money Transfer \t:  4");
			System.out.println("Creat Account \t:  5");
			System.out.println("Deactivate Account \t:  6");
			System.out.println("Deposit money \t:  7");
			System.out.print("Enter the number as per following choice : ");
			x=sc2.nextInt();
			System.out.println();
			if(x<=0 && x>7)continue;
			else if (x==7)break;
			switch(x) {
					case 1:
						i=getIndex(persons);
						persons.get(i).balanceInquiry();
						break;
					case 2:
						i=getIndex(persons);
						System.out.print("Enter amount to withdraw : ");
						money = sc2.nextDouble();
						persons.get(i).withdrawMoney(money);
						break;
					case 3:
						i=getIndex(persons);
						System.out.print("Enter amount to deposit : ");
						money = sc2.nextDouble();
						persons.get(i).depositMoney(money);
						System.out.println("Amount Deposited Successfully.");
						break;
					case 4:
						i=getIndex(persons);
						System.out.print("Enter account ID  in which you want to transfer the money : ");
											
						int j=getIndex(persons);
						System.out.print("Enter amount to transfer : ");
						money=sc2.nextDouble();
						persons.get(i).withdrawMoney(money);
						persons.get(j).depositMoney(money);
						break;
					case 5:
						AccountQ2 p=new AccountQ2();
						i=p.setbalance();
						if(i==1) {
							p.AccountDetail();
							persons.add(p);
							break;
						}
						else {
							System.out.println("Account is not Created.");
							break;
						}
					case 6:
						i=getIndex(persons);
						persons.remove(i);
						System.out.println("Account removed successfully.");
						break;
					case 7:
						flag=false;
						break;
					case 0:
						flag=false;
						break;
				
			}
			
		}
		System.out.println("By Shekhat Krupa 21CE133");
		sc2.close();
	}
	

	
}
