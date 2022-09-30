import java.util.*;
public class P2T1 extends Thread  {
	int[] array; 
	public P2T1(int[] array) {
			this.array = array; 
	}
	void odd(int[] array) { 
		this.array = array; 
		start(); 
	}
	public void run() { 
		System.out.println("odd :"); 
		for (int j = 0; j < array.length; j++) { 
			if (j % 2 == 1) { 
				System.out.println(array[j]); 
			} 
		} 
	} 
}
