package A3.A3Q5.package2;
import A3.A3Q5.package1.myClass1;
public class myClass4 extends myClass1{
	public static void main(String []args){
		myClass4 obj4 = new myClass4();
		//obj4.pri();//private method can't be allowed in different package inherited class 
		obj4.pro();
		obj4.pub();
		//obj4.def();//default method can't be allowed in different package inherited class 
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
