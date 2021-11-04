package module2.multiarray;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
*/
public class Task9 {

	public static void main(String[] args) {
		double[][] matrix;
		double sum;
		double currentSum;
		int columnMaxSum;

		{
			matrix = new double[][] { { 2.5, 7.2, 6, 9.9 }, { 30.4, 12, 1.8, 7.1 }, { 12, 4.8, 33, 101.3 } };
			sum = 0;
			columnMaxSum = 0;
		}

		outputDoubleMatrix(matrix);
		System.out.println("-----------------------------------");
		
		for (int j = 0; j < matrix[0].length; j++) {

			currentSum = 0;

			for (int i = 0; i < matrix.length; i++) {

				currentSum += matrix[i][j];
			}

			
			System.out.print(currentSum + "\t");

			if (currentSum > sum) {
				sum = currentSum;
				columnMaxSum = j;
			}
		}

		System.out.println("Сумма = " + sum + " " + "столбец " + (columnMaxSum + 1));
	}
	
	
	private static void outputDoubleMatrix(double[][] matrix) {
		for (double[] arr : matrix) {
			for (double element : arr) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
		
	}
}
