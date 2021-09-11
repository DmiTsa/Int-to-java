package arr.multidim.p14;

/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */
public class Main {
    public static void main(String[] args) {
        int m = 14, n = 6;
        int[][] matrix = new int[m][n];
        int mx;
        for (int j = 1; j < n; j++) {
            int count = 0;
            do {
                do {
                    mx = ((int) (Math.random() * m));
                } while (matrix[mx][j] != 0);

                matrix[mx][j] = 1;
                count++;
            } while (count != j);
        }
        for (int[] arr : matrix) {
            for (int elem : arr) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
