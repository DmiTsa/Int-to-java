package b_algoritmization.b_multidimensionArrays_n;

public class Task7 {
    /*
Сформировать квадратную матрицу порядка N по правилу
и подсчитать количество положительных элементов в ней.
 */
    public static void main(String[] args) {
        int n = 6;
        double[][] matrix = new double[n][n];
        int posCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin((Math.pow((double) i, 2) - Math.pow((double) j, 2) / n));
                if (matrix[i][j] > 0) {
                    posCount++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Положительных элементов: " + posCount);
    }
}
