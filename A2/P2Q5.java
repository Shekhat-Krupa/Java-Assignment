//Created by Shekhat Krupa (21CE133)
//Aim : Develop a Program that illustrate method overloading concept
//package Part2;
public class P2Q5
{
    void record(String t )
    {
        System.out.println(t);
    }
    void record(String studentName,char grade)
    {
        System.out.println("Student name is "+studentName);
        System.out.println("Student grade is "+grade);
    }
    void record(int id,String studentName,char grade)
    {
        System.out.println("Student ID is "+id);
        System.out.println("Student name is "+studentName);
        System.out.println("Student grade is "+grade);
    }
    public static void main(String[]args)
    {
    	P2Q5 obj =new P2Q5();
        obj.record("Record of The students :-");
        System.out.println();

        obj.record("Krupa",'A');
        obj.record(8, "Dhruv", 'B');

        System.out.println("By Shekhat Krupa 21CE133");

    }
}