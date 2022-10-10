//Created by Shekhat Krupa (21CE133)
/*
* Practical 3
*
*/
import java.util.*;

public class Practical_3 {
    static int getIndex(ArrayList<Account_for_P3> persons) {
 
        String ID=null;
        int i=0;
        boolean flag = true;
        //@SuppressWarnings("resource")
        Scanner sc1 = new Scanner (System.in);
        System.out.print("Enter ID of the account : ");
        for(i=0;i<persons.size()+1;i++) {
            if(flag) {
                ID=sc1.next();
                i=0;
                flag=false;
            }
            else if(i==persons.size()) {
                System.out.println("No account found.");
                flag=true;
                i=0;
                break;
            }
            if(ID.equals(persons.get(i).getAccountID())) {
                System.out.println("Account ID " + persons.get(i).getAccountID()+ " Found");
                break;
            }
        }
        return i;
        //sc1.close();
    }
    public static void main(String argc[]) {
        ArrayList<Account_for_P3> persons = new ArrayList<Account_for_P3>();
        boolean flag=true;
        double money;
        int i;
        for(i=0;i<10;i++) {
            Account_for_P3 a=new Account_for_P3();
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
            System.out.println("Withdraw money \t\t:  2");
            System.out.println("Deposit money \t\t:  3");
            System.out.println("Money Transfer \t\t:  4");
            System.out.println("Create Account \t\t:  5");
            System.out.println("Deactivate Account\t:  6");
            System.out.println("Exit \t\t\t:  7");
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
                    //money = sc2.nextDouble();
 
                    int j=getIndex(persons);
                    System.out.print("Enter amount to transfer : ");
                    money=sc2.nextDouble();
                    persons.get(i).withdrawMoney(money);
                    persons.get(j).depositMoney(money);
                    break;
                case 5:
                    Account_for_P3 p=new Account_for_P3();
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
        sc2.close();
    }
}
