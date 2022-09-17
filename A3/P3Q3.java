//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 3
 * WAP that illustrate the interface inheritance. Interface P is extended by P1 and P2 interfaces. 
 * 1,2 Interface P12 extends both P1 and P2. Each interface declares one method and one constant. 
 * Create one class that implements P12. By using the object of the class invokes each of its method
 * and displays constant.
 */
package A3;

public class P3Q3 {
	public static void main(String []a) {
		cheakInterfaceOfQ3 obj = new cheakInterfaceOfQ3();
			obj.displayP();
			obj.displayP1();
			obj.displayP2();
			obj.displayP3();
			System.out.println("By Shekhat Krupa 21CE133");
	}
}
