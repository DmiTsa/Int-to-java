package module2.multiarray;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
// 1  2   3   ...  n
// n n-1 n-2  ...  1
// 1  2   3   ...  n
// n n-1 n-2  ...  1 

public class Task4 {
	public static void main(String[] args) {
		int size;
		int[][] matrix;

		do {
			size = getIntFromConsole();
		} while (!(size % 2 == 0));

		matrix = new int[size][size];

		for (int i = 0; i < size; i++) {

			for (int j = size - 1; j >= 0; j--) {

				if (i % 2 == 0) {

					matrix[i][j] = j + 1;
				} else {

					matrix[i][j] = size - (j - 1) - 1;
				}

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