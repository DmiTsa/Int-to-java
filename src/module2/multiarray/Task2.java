package module2.multiarray;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {
	public static void main(String[] args) {
		int[][] matrix;

		{
			matrix = new int[][] { { 74, 76, 78 }, { 4, 6, 5 }, { 8, 7, 47 } };
		}
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(matrix[i][i]);
		}
	}
}
