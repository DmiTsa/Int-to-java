package module1.branching;

import java.util.Scanner;

//����� max{min(a, b), min(c, d)}.
public class Task2 {
	public static void main(String[] args) {
		System.out.println("������� a, b, �, d");
		Scanner scanner = new Scanner (System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		scanner.close();
		
		int rezult = Math.max(Math.min(a, b), Math.min(c, d));
		System.out.println("���������: " + rezult);
	}
}
