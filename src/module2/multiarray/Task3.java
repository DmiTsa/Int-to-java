package module2.multiarray;
//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		int[][] matrix;
		int indexRow;
		int indexColumn;

		{
			matrix = new int[][] { { 74, 76, 78, 70, 78 }, { 4, 6, 5 }, { 8, 7, 47, 14, 8 } };
		}

		System.out.println("Введите номер строки для вывода (Нумерация с 0)");
		do {
			indexRow = getIntFromConsole();
		} while (!(indexRow < matrix.length));

		outputIntMatrixRow(matrix, indexRow);

		System.out.println("Введите номер столбца для вывода (Нумерация с 0)");
		do {
			indexColumn = getIntFromConsole();
		} while (!(indexColumn < matrixIntMaxLengthRow(matrix)));

		outputIntMatrixColumn(matrix, indexColumn);
	}

	private static void outputIntMatrixRow(int[][] matrix, int indexRow) {
		if (indexRow < matrix.length) {
			for (int j = 0; j < matrix[indexRow].length; j++) {
				System.out.print(matrix[indexRow][j] + " ");
			}
		}
		System.out.println();
	}

	private static void outputIntMatrixColumn(int[][] matrix, int indexColumn) {
		int[] matrixRowLength;

		matrixRowLength = new int[matrix.length];

		for (int i = 0; i < matrixRowLength.length; i++) {
			matrixRowLength[i] = matrix[i].length;
		}

		for (int i = 0; i < matrixRowLength.length; i++) {

			if (matrixRowLength[i] > indexColumn) {

				System.out.println(matrix[i][indexColumn]);
			}
		}
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

	private static int matrixIntMaxLengthRow(int[][] matrix) {
		int maxLength;
		int currentLength;

		{
			maxLength = 0;
			currentLength = 0;
		}

		for (int i = 0; i < matrix.length; i++) {
			currentLength = matrix[i].length;
			maxLength = (currentLength > maxLength) ? currentLength : maxLength;
		}

		return maxLength;
	}
}