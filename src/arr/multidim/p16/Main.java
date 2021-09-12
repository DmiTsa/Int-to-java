package arr.multidim.p16;

import java.util.Arrays;
import java.util.Scanner;

/*
 Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n2
так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите порядок магического квадрата");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int s = (n * (n * n + 1)) / 2; //сумма квадрата
        int[] numStack = new int[n * n + 1]; //все доступные числа
        int num = 0;
        for (int i = 1; i <= (n * n); i++) {
            numStack[i] = i;
        }
        numOfArray(numStack);
        System.out.println(numStack[0]);
        System.out.println(Arrays.toString(numStack));
        numOfArray(numStack);
        System.out.println(numStack[0]);
        System.out.println(Arrays.toString(numStack));
        numOfArray(numStack);
        System.out.println(numStack[0]);
        System.out.println(Arrays.toString(numStack));
        numOfArray(numStack);
        System.out.println(numStack[0]);
        System.out.println(Arrays.toString(numStack));
        System.out.println(numStack[0]);
        System.out.println(Arrays.toString(numStack));

    }

    public static int[] numOfArray(int[] array) {   //перемещает случайное не нулевое значение массива в начало этого массива на его место записывается 0
        int sum = 0;
        for (int i = 2; i < array.length; i++) {
            sum += array[i];
        }

        int randIndex;
        do {
            randIndex = (int) (Math.random() * (array.length));
            if ((randIndex != 0) & (array[randIndex] != 0)) break;
        } while (true);
        array[0] = array[randIndex];
        array[randIndex] = 0;

        if (sum == 0) {
            array[0] = -1;
        }
        return array;
    }
}
