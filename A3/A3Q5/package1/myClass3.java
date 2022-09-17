package A3.A3Q5.package1;
public class myClass3 extends myClass1{
	public static void main(String []args)
	{
		myClass1 obj = new myClass1();
		//obj.pri();//private method can't be allowed in same package inherited class 
		obj.pro();
		obj.pub();
		obj.def();
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
