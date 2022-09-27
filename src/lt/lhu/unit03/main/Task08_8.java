package lt.lhu.unit03.main;

public class Task08_8 {

	public static void main(String[] args) {
		double a, b, c, h, y;
		a = 0;
		b = 22;
		h = 1;
		c = 22.2;

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");

		for (double x = a; x <= b; x = x + h) {
			if (x == 15) {
				y = (x + c) * 2;
			} else {
				y = (x - c) + 6;
			}
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");

	}

}
