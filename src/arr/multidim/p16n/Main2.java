package arr.multidim.p16n;

import java.util.Arrays;
import java.util.Scanner;

/*
 Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n2
так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат
 */
public class Main2 {
    public static void main(String[] args) {
        int n = 3; //порядок квадрата
        int[][] matrix = new int[n][n];
        int s = (n * (n * n + 1)) / 2; //сумма квадрата
        int[] numStack = new int[n * n + 1]; //все доступные числа
        int num = 0;
        for (int i = 1; i <= (n * n); i++) {
            numStack[i] = i;
        }
        while (true) {
            for (int m = 0; m < (n - 1); m++) {
                for (int k = 0; k < (n - 1); k++) {
                    array0Rand(numStack);
                    matrix[m][k] = numStack[0];
                }
            }

            for (int i = 1; i < numStack.length; i++) {
                if (numStack[i] != 0) && () {
                    matrix[0][3] =
                }
            }


        }
        //выход
    }

    public static int[] array0Rand(int[] array) {
        int index;
        boolean stop = true;
        while (stop) {
            index = (int) (Math.random() * array.length) + 1;
            if (array[index] != 0) {
                array[0] = array[index];
                array[index] = 0;
                stop = false;
            }
        }
        return array;
    }

}