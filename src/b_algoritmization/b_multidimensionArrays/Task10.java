package b_algoritmization.b_multidimensionArrays;

public class Task10 {
    //Найти положительные элементы главной диагонали квадратной матрицы.
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 7, 6},
                {30, -12, 1},
                {12, 4, 33}};
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + "\t");
            }
        }

    }
}
