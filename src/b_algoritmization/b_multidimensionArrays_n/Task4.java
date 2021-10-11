package b_algoritmization.b_multidimensionArrays_n;

public class Task4 {
    //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
    public static void main(String[] args) {
        int n = 6;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                }
                if (i % 2 != 0) {
                    matrix[i][j] = n - (j - 1)-1;
                }
            }
        }
        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}