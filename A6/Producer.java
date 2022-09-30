
public class Producer extends Thread {
	StringBuffer buffer;
	public Producer() {
		buffer = new StringBuffer();
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				buffer.append(i);
				System.out.println("Prodused : " + i);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Buffer if FULL");
		Consumer c = new Consumer(this);// object of consumer class
	}
}
