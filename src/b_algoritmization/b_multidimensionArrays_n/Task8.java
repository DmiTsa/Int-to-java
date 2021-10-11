package b_algoritmization.b_multidimensionArrays_n;

import java.util.Scanner;

public class Task8 {
    /*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */
    public static void main(String[] args) {
        int[][] matrix = {{4, 8, 6, 7},
                {7, 1, 3, 3},
                {9, 8, 7, 2},
                {6, 4, 5, 8}};
        Scanner sc = new Scanner(System.in);
        int a, b;
        int tmp = 0;
        System.out.println("Введите номера столбцов для замены");
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == (b - 1)) {
                    tmp = matrix[i][j];
                    matrix[i][j] = matrix[i][a - 1];
                    matrix[i][a - 1] = tmp;
                }
            }
        }
        for (int[] arr : matrix) {
            for (int elem : arr) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
