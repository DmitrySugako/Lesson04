package lt.lhu.unit03.main;

public class Task15 {

	public static void main(String[] args) {
		int x = 3, y = 4;
		if (x > y) {
			y = (x + y) / 2;
			x = (x * y) * 2;
		} else {
			x = (x + y) / 2;
			y = (x * y) * 2;
		}
		System.out.println(" x=" + x + " y=" + y);
	}

}
