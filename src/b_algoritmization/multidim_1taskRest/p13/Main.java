package b_algoritmization.multidim_1taskRest.p13;

/*
Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */
public class Main {
    public static void main(String[] args) {
        int n = 4; //порядок матрицы
        int matrix[][] = {{4, 8, 6, 7},
                {7, 1, 3, 3},
                {9, 12, 7, 2},
                {6, 4, 5, 8}};

        System.out.println("Сортировка по возрастанию в столбце");
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                int min = matrix[i][k];
                int pos = i;
                for (int j = i; j < n; j++) {
                    if (matrix[j][k] < min) {
                        pos = j;
                        min = matrix[j][k];
                    }
                }
                matrix[pos][k] = matrix[i][k];
                matrix[i][k] = min;
            }
        }
        for (int[] arr : matrix) {
            for (int elem : arr) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }

        System.out.println("Сортировка по убыванию в столбце");
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                int max = matrix[i][k];
                int pos = i;
                for (int j = i; j < n; j++) {
                    if (matrix[j][k] > max) {
                        pos = j;
                        max = matrix[j][k];
                    }
                }
                matrix[pos][k] = matrix[i][k];
                matrix[i][k] = max;
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