package b_algoritmization.multidim_1taskRest.p10;

/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{2, 7, 6},
                {30, -12, 1},
                {12, 4, 33}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((matrix[i][j] > 0) && (i == j)) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        }
    }
}
