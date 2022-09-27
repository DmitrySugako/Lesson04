package lt.lhu.unit03.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		if (a < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
