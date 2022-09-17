package A3.A3Q5.package2;
import A3.A3Q5.package1.myClass1;
public class myClass5 {
	public static void main(String []a) {
		myClass1 obj = new myClass1();
		//obj.pri();//private method can't be allowed in different package imported class 
		//obj.pro();//protected method can't be allowed in different package imported class 
		obj.pub();
		//obj4.def();//default method can't be allowed in different package imported class 
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
