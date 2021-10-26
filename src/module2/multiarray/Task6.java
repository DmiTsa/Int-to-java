package module2.multiarray;
// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
//1  1  1   ...   1  1  1
//0  1  1   ...   1  1  0
//0  0  1   ...   1  0  0
//.. .. ..  ...  .. .. ..
//0  1  1   ...   1  1  0
//1  1  1   ...   1  1  1 

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int size;
        
        System.out.println("Введите разрядность матрицы (четное целое число)");
		do {
			size = getIntFromConsole();
		} while (!(size % 2 == 0));
            
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size - i; j++) {
                matrix[i][j] = 1;
            }
        }
        
        for (int i = size/2; i < size; i++) {
            for (int j = size-i-1; j < i+1; j++) {
                matrix[i][j] = 1;
            }
        }

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