
public class L2 {//logic of 2nd Practical
	public void findOZ(String s) {
		if (s.charAt(0) == 'o' || s.charAt(0) == 'O') {
            if (s.charAt(1) == 'z' || s.charAt(1) == 'Z') {//first two latter are oz
                System.out.println("oz");
            }
            else {//only first latter is o
                System.out.println("o");
            }
        }
        else if (s.charAt(1) == 'z' || s.charAt(1) == 'Z') {//only second latter is z
            System.out.println("z");
        }
        else {//not start with oz
            System.out.println("The character o and z isn't found in inputted string.");
        }
	}
}
