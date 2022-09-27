package lt.lhu.unit03.main;

public class Task07_7 {

	public static void main(String[] args) {
		double a, b, h, y;
		a = 0;
		b = 14;
		h = 1.4;

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x = x + h) {
			if (x <= 2) {
				y = -x;
			} else {
				y = x;
			}
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
	}

}
