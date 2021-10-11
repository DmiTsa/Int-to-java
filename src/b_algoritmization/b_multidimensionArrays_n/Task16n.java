package b_algoritmization.b_multidimensionArrays_n;

public class Task16n {
    /* Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n2
        так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
        собой. Построить такой квадрат
         */
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int randomIndex;

        int sum = (3 * (3 * 3 + 1)) / 2; //сумма квадрата
        int[] numStack = new int[10]; //рабочий массив для перебора
        int[] numStackCp = new int[10]; //начальное состояние
        int[] numStack1 = new int[10]; //снимок numStack до заполнения 1 строки
        int[] numStack2 = new int[10]; //снимок numStack до заполнения 2 строки

        for (int i = 1; i <= (3 * 3); i++) {
            numStack[i] = i;
        }
        //индекс равен элементу массива чисел
        boolean mainFlag = true;
        System.arraycopy(numStack, 0, numStackCp, 0, 10);
        do {
            System.arraycopy(numStackCp, 0, numStack, 0, 10);
            boolean flag;
            System.arraycopy(numStack, 0, numStack1, 0, 10);
            do {
                flag = true;
                do {
                    randomIndex = (int) (Math.random() * 9 + 1);
                    if (numStack[randomIndex] != 0) {
                        randomIndex = numStack[randomIndex];
                        numStack[randomIndex] = 0;
                    } else {
                        randomIndex = 0;
                    }
                } while (randomIndex == 0);
                matrix[0][0] = randomIndex;
                do {
                    randomIndex = (int) (Math.random() * 9 + 1);
                    if (numStack[randomIndex] != 0) {
                        randomIndex = numStack[randomIndex];
                        numStack[randomIndex] = 0;
                    } else {
                        randomIndex = 0;
                    }
                } while (randomIndex == 0);
                matrix[0][1] = randomIndex;
                do {
                    randomIndex = (int) (Math.random() * 9 + 1);
                    if (numStack[randomIndex] != 0) {
                        randomIndex = numStack[randomIndex];
                        numStack[randomIndex] = 0;
                    } else {
                        randomIndex = 0;
                    }
                } while (randomIndex == 0);
                matrix[0][2] = randomIndex;
                if (matrix[0][0] + matrix[0][1] + matrix[0][2] == sum) {
                    flag = false;
                } else {
                    System.arraycopy(numStack1, 0, numStack, 0, 10);
                }
            } while (flag);
// вторая строка
            System.arraycopy(numStack, 0, numStack2, 0, 10);
            do {
                flag = true;
                do {
                    randomIndex = (int) (Math.random() * 9 + 1);
                    if (numStack[randomIndex] != 0) {
                        randomIndex = numStack[randomIndex];
                        numStack[randomIndex] = 0;
                    } else {
                        randomIndex = 0;
                    }
                } while (randomIndex == 0);
                matrix[1][0] = randomIndex;
                do {
                    randomIndex = (int) (Math.random() * 9 + 1);
                    if (numStack[randomIndex] != 0) {
                        randomIndex = numStack[randomIndex];
                        numStack[randomIndex] = 0;
                    } else {
                        randomIndex = 0;
                    }
                } while (randomIndex == 0);
                matrix[1][1] = randomIndex;
                do {
                    randomIndex = (int) (Math.random() * 9 + 1);
                    if (numStack[randomIndex] != 0) {
                        randomIndex = numStack[randomIndex];
                        numStack[randomIndex] = 0;
                    } else {
                        randomIndex = 0;
                    }
                } while (randomIndex == 0);
                matrix[1][2] = randomIndex;
                if (matrix[1][0] + matrix[1][1] + matrix[1][2] == sum) {
                    flag = false;
                } else {
                    System.arraycopy(numStack2, 0, numStack, 0, 10);
                }
            } while (flag);
// третья строка
            do {
                randomIndex = (int) (Math.random() * 9 + 1);
                if (numStack[randomIndex] != 0) {
                    randomIndex = numStack[randomIndex];
                    numStack[randomIndex] = 0;
                } else {
                    randomIndex = 0;
                }
            } while (randomIndex == 0);
            matrix[2][0] = randomIndex;
            do {
                randomIndex = (int) (Math.random() * 9 + 1);
                if (numStack[randomIndex] != 0) {
                    randomIndex = numStack[randomIndex];
                    numStack[randomIndex] = 0;
                } else {
                    randomIndex = 0;
                }
            } while (randomIndex == 0);
            matrix[2][1] = randomIndex;
            do {
                randomIndex = (int) (Math.random() * 9 + 1);
                if (numStack[randomIndex] != 0) {
                    randomIndex = numStack[randomIndex];
                    numStack[randomIndex] = 0;
                } else {
                    randomIndex = 0;
                }
            } while (randomIndex == 0);
            matrix[2][2] = randomIndex;

            if ((matrix[2][0] + matrix[2][1] + matrix[2][2] == sum) && (matrix[0][0] + matrix[1][1] + matrix[2][2] == sum) &&
                    (matrix[0][2] + matrix[1][1] + matrix[2][0] == sum)) {
                mainFlag = false;
            }
        } while (mainFlag);
        //вывод на консоль
        for (int[] arrays : matrix){
           for (int element:arrays){
                System.out.println(element+"\t");
            }
            System.out.println();
       }
    }
}