package b_algoritmization.b_multidimensionArrays_n;

public class Task11 {
    /*
Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раза.
 */
    public static void main(String[] args) {
        int n = 10, m = 15;
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }
        for (int[] arr : matrix) {
            for (int elem : arr) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
        System.out.print("Строки с повторением 5 три или более раза: ");
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.print((i + 1) + "\t");
            }
        }


    }
}
