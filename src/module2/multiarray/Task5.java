package module2.multiarray;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

//1  1  1   ...   1  1  1
//2  2  2   ...   2  2  0
//3  3  3   ...   3  0  0
//.. .. ..  ...  ..  0  0
//n  0  0   ...   0  0  0 

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int size;
		int[][] matrix;

		System.out.println("Введите разрядность матрицы (четное целое число)");
		do {
			size = getIntFromConsole();
		} while (!(size % 2 == 0));

		matrix = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				matrix[i][j] = i + 1;
			}
		}

		outputIntMatrix(matrix);
	}

	private static int getIntFromConsole() {
		int value;

		System.out.print(">");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print(">");
		}

		value = scanner.nextInt();

		return value;
	}

	private static void outputIntMatrix(int[][] matrix) {
		for (int[] arr : matrix) {
			for (int element : arr) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}
}
