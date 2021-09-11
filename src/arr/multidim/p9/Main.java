package arr.multidim.p9;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{2, 7, 6,9},
                {30, 12, 1,7},
                {12, 4, 33,100}};
        int sum = 0;
        int tmp,column=0;
        for (int j=0; j < 4; j++) {
            tmp = 0;
            for (int i = 0; i < 3; i++) {
                tmp += matrix[i][j];
            }
            System.out.println("Сумма столбца равна " + tmp);
            if (tmp > sum) {
                sum = tmp;
                column = j;
            }
        }
        System.out.println("Сумма = " + sum +" "+ "столбец " + (column+1));
    }
}
