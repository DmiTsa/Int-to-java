package module1.cycles;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите границы значений функции");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Введите шаг функции");
		int step = scanner.nextInt();
		scanner.close();
		
		for (int i = a; i <= b; i += step) {
			if (i >= 2) {
				int rezult = i;
				System.out.println(rezult);
			} else {
				int rezult = -i;
				System.out.println(rezult);
			} 
		}
	}

}
