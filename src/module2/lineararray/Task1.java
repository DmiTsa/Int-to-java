package module2.lineararray;

import java.util.Arrays;
import java.util.Scanner;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
public class Task1 {
	public static void main(String[] args) {
		int[] array;
		int multiple;
		int sum;
		
		array = getArrayNaturalFromConsole();
		
		System.out.println("Число кратности >>");
		multiple = getIntFromConsole();
		
		sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % multiple == 0) {
				sum += array[i];
			}
		}
		
		System.out.println("Сумма чисел, кратных " + multiple + ", равна " + sum);
	}

	private static int getIntFromConsole() {
		int value;

		System.out.print(">");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Неверный ввод! Повторите");
			System.out.print(">");
		}

		value = scanner.nextInt();

		return value;
	}

	private static int[] getArrayNaturalFromConsole() {
		int size;
		int maxValue;
		int[] array;

		System.out.println("Введите размерность массива (целое число больше 0)");
		do {
			size = getIntFromConsole();
		} while (!(size >= 0));

		System.out.println("Введите максимально возможное значение элемента (целое число больше 0)");
		do {
			maxValue = getIntFromConsole();
		} while (!(maxValue >= 0));

		array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * maxValue + 1);
		}

		System.out.println(Arrays.toString(array));
		
		return array;
	}

}
