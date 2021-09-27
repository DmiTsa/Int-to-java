package b_algoritmization.c_arraysSort_nn;

/*
Даны дроби p1/q1, p2/q2, ... pn/qn, ( pi , qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task8n {
    private static final int MULTIPLIERS_COUNT = 100;

    public static void main(String[] args) {

        int[][] fraction = {
                {8, 7, 12, 63, 23},
                {11, 8, 9, 14, 97}};
        int oneMl = 1;
        for (int elem : fraction[0]) {
            oneMl *= elem;
        }
        System.out.println(oneMl);
// общий знаменатель перемножение
        // отсортировать выбором используя frac[0]i / frac[1]i


        for (int[] arr : fraction) {
            for (int elem : arr) {
                System.out.print(elem + "\t\t");
            }
            System.out.println();
        }

    }

    private static int nok(int[] array) {
        int min = 1;
        boolean flag = true;
        while (flag) {
            min++;
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] % min == 0) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == array.length) {
                flag = false;
            }
        }
        return min;
    }
}

