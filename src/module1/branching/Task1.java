package module1.branching;

import java.util.Scanner;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
//и если да, то будет ли он прямоугольным.
public class Task1 {

	public static void main(String[] args) {
		System.out.println("Введите два угла в градусах");
		Scanner scanner = new Scanner (System.in);
		int angle1 = scanner.nextInt();
		int angle2 = scanner.nextInt();
		scanner.close();

		if ( (angle1 + angle2) < 180 ) {
			System.out.print("Треугольник существует");
			if (angle1 == 90 || angle2 == 90 || (angle1 + angle2) == 90) {
				System.out.print(" .Прямоугольный");
			} else {
				System.out.print(" .Не прямоугольный");
			}
		} else {
			System.out.print("Треугольник не существует");
		}
		
	}

}
