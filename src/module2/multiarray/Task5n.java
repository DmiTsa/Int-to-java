package module2.multiarray;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//1  1  1   ...   1  1  1
//2  2  2   ...   2  2  0
//3  3  3   ...   3  0  0
//.. .. ..  ...  ..  0  0
//n  0  0   ...   0  0  0 

public class Task5n {
	public static void main(String[] args) {
		int n = 10;
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				matrix[i][j] = i + 1;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
