package lt.lhu.unit03.main;

import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		int x = sc.nextInt();
		if (x == 9583 || x == 1747) {
			System.out.println("Access level A,B,C");
		} else if (x == 3331 || x == 7922) {
			System.out.println("Access level B,C");
		} else if (x == 9455 || x == 8997) {
			System.out.println("Access level C");
		} else {
			System.out.println("Wrong password");
		}

	}

}
