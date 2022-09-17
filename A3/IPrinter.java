package A3;

interface IPrinter {
	default void display(){
		System.out.println("\nThis is default method from IPrinter interface.\n");
	}
	void displaymarks();
	void displayName();
}
	