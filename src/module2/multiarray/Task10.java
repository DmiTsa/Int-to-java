package module2.multiarray;

//Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {

	public static void main(String[] args) {
		int[][] matrix;

		{
			matrix = new int[][] { { 2, 7, 6 }, { 30, -12, 1 }, { 12, 4, 33 } };
		}

		outputIntMatrix(matrix);
		System.out.println("Положительные элементы главной диагонали");
		
		for (int i = 0; i < matrix.length; i++) {
			
			if (matrix[i][i] > 0) {
				
				System.out.print(matrix[i][i] + "\t");
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
