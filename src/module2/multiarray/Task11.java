package module2.multiarray;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раза.

public class Task11 {

	public static void main(String[] args) {
		final int NROW = 10;
		final int NCOLUMN = 20;
		final int MAX_RANDOM_VALUE = 15;

		int[][] matrix;

		{
			matrix = new int[NROW][NCOLUMN];
		}

		for (int i = 0; i < NROW; i++) {

			for (int j = 0; j < NCOLUMN; j++) {

				matrix[i][j] = (int) (Math.random() * (MAX_RANDOM_VALUE + 1));
			}
		}

		outputIntMatrix(matrix);

		System.out.print("Номера строк с повторением \"5\" три или более раза: ");

		int count;
		for (int i = 0; i < NROW; i++) {
			count = 0;
			
			for (int j = 0; j < NCOLUMN; j++) {
				
				if (matrix[i][j] == 5) {
					count++;
				}
			}
			
			if (count >= 3) {
				System.out.print((i + 1) + "\t");
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
