package module2.lineararray;

import java.util.Scanner;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
public class Task1 {
	public static void main(String[] args) {
		int[] array;
		int size;
		int maxValue;
		int multiple;
		int sum;

		System.out.println("Введите размерность массива (целое число больше 0)");
		do {
			size = getIntFromConsole();
		} while (!(size >= 0));

		System.out.println("Введите максимальное значение элемента массива(целое число больше 0)");
		do {
			maxValue = getIntFromConsole();
		} while (!(maxValue >= 0));

		array = new int[size];
		initArrayNatural(array, maxValue);

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

	private static void initArrayNatural(int[] array, int maxValue) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * maxValue + 1);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}

}
