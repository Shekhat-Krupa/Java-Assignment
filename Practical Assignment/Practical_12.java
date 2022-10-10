//Created by Shekhat Krupa (21CE133)
/*
* Practical 12
* Create an Association class that encapsulates two objects of different types. 
* Similar  to Exercise above, create a Transition class that does the same as the Association class  with three objects.
*/
public class Practical_12 {
    public static void main(String[] args) {
        
        // Creating objects of bank and Employee class
        Bank bank = new Bank("SBI");
        Employee emp = new Employee("Shekhat Krupa");
        System.out.println(emp.getEmployeeName() + " is employee of "+ bank.getBankName());
        System.out.println("By Shekhat Krupa 21CE133");
    }
}
