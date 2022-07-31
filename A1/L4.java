
public class L4 {//logic of 4th Practical

	public boolean sequence(int[] a) {
		int count =0;
		for (int i = 0; i < a.length - 2; i++) {
			//check the continuous 1, 2, 3 is there or not
            if (a[i] == 1 && a[i + 1] == 2 && a[i + 2] == 3) {
                count++;
            }
        }
        if (count == 1)
            return true;
        else 
            return false;
	}
}
