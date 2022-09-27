package lt.lhu.unit03.main;

public class Task09_9 {

	public static void main(String[] args) {
		double a, b, sum;
		a = 1;
		b = 100;
		sum = 0;
		for (double i = a; i <= b; i++) {
			sum = sum + Math.pow(i, 2);
		}
		System.out.println("sum= " + sum);
	}

}
