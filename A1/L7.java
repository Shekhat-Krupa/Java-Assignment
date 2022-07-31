
public class L7 {
	public void pyramid(int n) {
		String s = new String(" ");
        int num = 0, i= 0,j=0;
		for ( i = 0; i <= n; i++) {

            for ( j = 1; j <= n - i;j++) {
                System.out.printf("%4s", s);
            }

            for ( j = 0; j <= i; j++) {
                num = (int) Math.pow(2, j);

                System.out.printf("%4d", num);
            }

            for (j = i - 1; j >= 0; j--) {
                num = (int) Math.pow(2, j);

                System.out.printf("%4d", num);
            }
            System.out.println();
        }
	}
}
