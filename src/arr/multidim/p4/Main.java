package arr.multidim.p4;

/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix;

        for (int i = 1; i < n + 1; i++) {
            for (int j = n; j > 0; j--) {
                if (i % 2 != 0) {
                    matrix[i][j] = j;
                }
                if ((i % 2 == 0) && (j == n)){
                    matrix[i][matrix[0].length - 1] = 1;
                } else {
                    matrix[i][j]=
                }

            }
        }
    }
}


//выделить четные и нечетные строки
//в нечетных проверку на посл элемент
