package A3;

public interface p {
	final int pv = 11;
	void displayP();
}

interface p1 extends p {
	final int pv1 = 122;
	void displayP1();
}
interface p2 extends p {
	final int pv2 = 133;
	void displayP2();
}
interface p12 extends p1, p2 {
	final int pv12 = 42233;
	void displayP3();
}
