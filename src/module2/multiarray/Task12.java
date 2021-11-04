package module2.multiarray;

import java.util.Arrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов
public class Task12 {

	public static void main(String[] args) {
		int[][] matrix;

		{
			matrix = new int[][] { { 4, 8, 6, 7 }, { 7, 1, 3, 3 }, { 9, 8, 7, 2 }, { 6, 4, 5, 8 } };
		}

		System.out.println("Оригинальная матрица");
		outputIntMatrix(matrix);
		
		System.out.println("Сортировка по возрастанию строк");
		
		for (int i = 0; i < matrix.length; i++) {
			Arrays.sort(matrix[i]);
		}
		outputIntMatrix(matrix);
	
		System.out.println("Сортировка по убыванию строк");
		
		inverseAllElement(matrix);
		
		for (int i = 0; i < matrix.length; i++) {
			Arrays.sort(matrix[i]);
		}
		
		inverseAllElement(matrix);
		outputIntMatrix(matrix);

	}

	private static void outputIntMatrix(int[][] matrix) {
		for (int[] arr : matrix) {
			for (int element : arr) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}
	
	private static void inverseAllElement (int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				matrix[i][j] *= -1;
			}
		}
	}
	
	
}
