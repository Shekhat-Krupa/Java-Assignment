
public class Consumer extends Thread {
	Producer p;
	Thread t;
	public Consumer(Producer temp) {
		p = temp;
		t = new Thread (this);
		t.start();
	}
	public void run() {
		
			try {
				for (int i = 0; i < 5; i++) {
					System.out.print(p.buffer.charAt(i) + " ");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("\nBuffer is now empty.");
		
	}
	
}
