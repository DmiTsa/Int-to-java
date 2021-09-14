package arr.multidim_1taskRest.p6;

/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                matrix[i][j] = 1;
            }
        }
        for (int i = n/2; i < n; i++) {
            for (int j = n-i-1; j < i+1; j++) {
                matrix[i][j] = 1;
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