package b_algoritmization.c_arraysSort;

/*
Даны дроби p1/q1, p2/q2, ... pn/qn, ( pi , qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task8n_var2 {
    private static final int MULTIPLIERS_COUNT = 100;

    public static void main(String[] args) {
        int[][] fraction = {
                {8, 7, 12, 63, 23},
                {11, 8, 14, 98, 28}}; //00000 найти НОК         НОК=a*b / НОД (a b)

int tmp = nok2(new int[]{10, 15});
        System.out.println(tmp);

        for (int[] arr : fraction) {
            for (int elem : arr) {
                System.out.print(elem + "\t\t");
            }
            System.out.println();
        }

    }

    private static int nod(int a, int b) {
        int max = a > b ? b : a;
        while (a % max != 0 || b % max != 0) {
            max--;
        }

        return max;
    }

    private static int nok(int a, int b) {

        return (a * b) / nod(a, b);
    }

    private static int nok2(int[] array) {
        int min=2;
            boolean flag = true;
            while (flag) {
                for (int j=0;j< array.length;j++){
                    if (array[j] % min != 0) {
                        min++;
                        break;
                    } else {
                        flag = false;
                    }
                }
            }
            return min;
        }
    }
    // Наименьшее общее кратное (НОК) чисел a и b — это наименьшее число, которое кратно a и b.
    // Другими словами, это такое маленькое число, которое делится без остатка на число a и число b.
