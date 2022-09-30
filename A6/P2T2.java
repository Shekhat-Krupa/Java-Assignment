import java.util.*;
public class P2T2 extends Thread{
	int[] array;
	public P2T2(int[] array) {
		this.array = array; 
	}
	void even(int[] array) { 
		this.array = array; 
		start(); 
	} 
	public void run() { 
		System.out.println("Even :"); 
		for (int j = 0; j < array.length; j++) { 
			if (j % 2 == 0) { 
				System.out.println(array[j]); 
			} 
		} 
	} 


}
