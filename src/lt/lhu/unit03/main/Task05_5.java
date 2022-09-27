package lt.lhu.unit03.main;

public class Task05_5 {

	public static void main(String[] args) {
		int x = 1, y = 1;
		while (x < 100) {
			x = x + 2;
			y = x + y;
		}
		System.out.println("y=" + y);
	}

}
