package module1.branching;

import java.util.Scanner;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
//Определить, пройдет ли кирпич через отверстие.
public class Task4 {

	public static void main(String[] args) {
		System.out.println("Введите размеры кирпича");
		Scanner scanner = new Scanner (System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		System.out.println("Введите размер отверстия");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		
		int minSize = Math.min(x, Math.min(y, z));
		int maxSize = Math.max(x, Math.max(y, z));
		int midSize = (x + y + z) - minSize - maxSize;
		
		if (minSize < Math.min(a, b) && midSize < Math.max(a, b)) {
				System.out.print("Пройдет");
		} else {
			System.out.print("Не пройдет");
		}
	}
}
