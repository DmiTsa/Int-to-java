package arr.multidim.p2;

/*
 Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{74, 76, 78}, {4, 6, 5}, {8, 7, 47}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}
