package lt.lhu.unit03.main;

public class Task10 {

	public static void main(String[] args) {
		double s1, s2;
		double r1 = 34.5, r2 = 33.4;

		s1 = Math.PI * Math.pow(r1, 2);
		s2 = Math.PI * Math.pow(r2, 2);
		if (s1 > s2) {
			System.out.println("Площадь 1ого круга больше");
		} else {
			System.out.println("Площаль 2ого круга больше");
		}

	}

}
