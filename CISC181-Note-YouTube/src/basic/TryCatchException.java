package basic;

import java.util.Scanner;

public class TryCatchException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 1;

		do {
			try {
				// if use double, 1/0 is infinite
				System.out.println("Enter first num: ");
				int a = input.nextInt();

				System.out.println("Enter Second num: ");
				int b = input.nextInt();

				int sum = a / b;
				System.out.println(sum);
				// change to 2 in oder to jump out the loop
				x = 2;

			} catch (Exception e) {
				System.out.println("can't do that");
			}
		} while (x == 1);
	}

}
