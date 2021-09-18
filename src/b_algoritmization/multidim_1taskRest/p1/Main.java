package b_algoritmization.multidim_1taskRest.p1;

/*
 Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{74, 76, 78, 70, 78}, {4, 6, 5, 14, 1}, {8, 7, 47, 14, 8}};

        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if ((j % 2 != 0) && (matrix[0][j] > matrix[matrix.length - 1][j])) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
