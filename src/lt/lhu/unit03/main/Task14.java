package lt.lhu.unit03.main;

public class Task14 {

	public static void main(String[] args) {

		int a = 45, b = 90, c = 45;
		if (a + b + c == 180) {
			System.out.println("Тругольник существует");
		} else {
			System.out.println("Треугольник не существует");
		}
		if (a == 90 || b == 90 || c == 90) {
			System.out.println("Тругольник прямоугольный");
		} else {
			System.out.println("Треугольник не прямоугольный");
		}
	}
}
