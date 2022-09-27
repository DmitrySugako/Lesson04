package lt.lhu.unit03.main;

import java.util.Scanner;

public class Task06_6 {

	public static void main(String[] args) {
		int y = 1, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		while (y < x) {
			sum = sum + y;
			y++;
		}

		System.out.println(sum);
	}

}
