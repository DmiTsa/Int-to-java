package module2.multiarray;

import java.util.Scanner;

/*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
*/
public class Task8 {

	public static void main(String[] args) {
		int[][] matrix;
		int columnReplace1;
		int columnReplace2;
		
		{
			matrix = new int[][] { { 4, 8, 6, 7 }, { 7, 1, 3, 3 }, { 9, 8, 7, 2 }, { 6, 4, 5, 8 } };
		}

		System.out.println("Начальная матрица");
		outputIntMatrix(matrix);

		System.out.println("Введите номер 1-го столбца для замены");
		do {
			columnReplace1 = getIntFromConsole();
			columnReplace1 -= 1;		

		} while (!(columnReplace1 < matrix[0].length && columnReplace1 >= 0));

		System.out.println("Введите номер 2-го столбца для замены");
		do {
			columnReplace2 = getIntFromConsole();
			columnReplace2 -= 1;
			
		} while (!(columnReplace2 < matrix[0].length && columnReplace2 >= 0));

		int tmp = 0;

		for (int i = 0; i < matrix.length; i++) {

			tmp = matrix[i][columnReplace2];
			matrix[i][columnReplace2] = matrix[i][columnReplace1];
			matrix[i][columnReplace1] = tmp;

		}

		System.out.println("Измененная матрица");
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
