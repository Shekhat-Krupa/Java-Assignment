package A3;
import java.util.Scanner;
public class concrete implements IPrinter, IScanner{
	//override all the methods of IPrinter and IScanner
	Scanner sc = new Scanner(System.in);
	String name,id;
	public void setmarks() {
		System.out.print("Enter student marks:");
		id=sc.next();
	}
	public void setName() {
		System.out.print("Enter student name:");
		name=sc.next();
	}
	
	public void displayName() {
		System.out.print(name+"\t");	
	}
	public void displaymarks() {
		System.out.println(id);
	}

}
