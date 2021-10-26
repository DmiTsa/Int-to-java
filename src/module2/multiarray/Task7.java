package module2.multiarray;

//Сформировать квадратную матрицу порядка N по правилу A [I J] = sin( ( I2 - J2 ) / N )
//и подсчитать количество положительных элементов в ней.
public class Task7 {

	public static void main(String[] args) {
		int size;
		int posCount;
		double[][] matrix;

		{
			size = 6;
			matrix = new double[size][size];
			posCount = 0;
		}

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {

				matrix[i][j] = Math.sin((Math.pow(i, 2d) - Math.pow(j, 2d) / size));

				if (matrix[i][j] > 0) {

					posCount++;
				}
			}
		}

		outputDoubleMatrix(matrix);

		System.out.println("Положительных элементов: " + posCount);
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
