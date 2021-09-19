package b_algoritmization.b_multidimensionArrays;

public class Task5 {
    //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    public static void main(String[] args) {
        int n = 10;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                matrix[i][j]= i+1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
