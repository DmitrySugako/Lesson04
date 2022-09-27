package lt.lhu.unit03.main;

public class Task10_10 {

	public static void main(String[] args) {
		long a, b, x;
		a = 1;
		b = 200;
		x = 1;

		for (long i = a; i <= b; i++) {
		x =(long) (x * Math.pow(i, 2));
		}
		System.out.println("x= " + x);
	}

}
