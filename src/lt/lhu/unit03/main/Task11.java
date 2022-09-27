package lt.lhu.unit03.main;

public class Task11 {

	public static void main(String[] args) {
		double a1 = 33, a2 = 33.4, b1 = 22, b2 = 54.4;
		double s1, s2;
		s1 = 0.5 * a1 * b1 * Math.sin(a1);
		s2 = 0.5 * a2 * b2 * Math.sin(a2);
		if (s1 > s2) {
			System.out.println("больше s1");
		} else {
			System.out.println("больше s2");
		}

	}

}
