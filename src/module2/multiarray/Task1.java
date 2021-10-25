package module2.multiarray;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
public class Task1 {
	public static void main(String[] args) {
		int[][] matrix;

		{
			matrix = new int[][] { { 7, 74, 76, 78, 90, 1 }, { 8, 4, 6, 5, 14, 1 }, { 1, 8, 7, 47, 80, 8 } };
		}

		System.out.println("Начальная матрица");
		outputIntMatrix(matrix);
		System.out.println("Результат");

		for (int j = 1; j < matrix[0].length; j++) {
			if (j % 2 != 0 && matrix[0][j] > matrix[matrix.length - 1][j]) {
				for (int i = 0; i < matrix.length; i++) {
					System.out.println(matrix[i][j]);
				}
				System.out.println();
			}
		}
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