package lt.lhu.unit03.main;

public class Task12 {

	public static void main(String[] args) {
		double a = 3, b = -4, c = -6;
		if (a > 0) {
			a = Math.pow(a, 2);
		} else {
			a = Math.pow(a, 4);
		}
		if (b > 0) {
			b = Math.pow(b, 2);
		} else {
			b = Math.pow(b, 4);
		}
		if (c > 0)

		{
			c = Math.pow(c, 2);
		} else {
			c = Math.pow(c, 4);
		}
		System.out.println(" a=" + a + " b=" + b + " c=" + c);
	}
}
