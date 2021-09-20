package b_algoritmization.c_arraysSort;

import java.util.Arrays;

/*
Даны дроби p1/q1, p2/q2, ... pn/qn, ( pi , qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task8n_var2 {
    private static final int MULTIPLIERS_COUNT = 100;

    public static void main(String[] args) {
        int[][] fraction = {
                {8, 7, 12, 63, 23},
                {11, 8, 14, 98, 28}}; //00000
        int denom = 1;
        for (int i = 0; i < fraction[0].length; i++) {
            denom *= fraction[1][i];
        }
        for (int i = 0; i < fraction[0].length; i++) {
            int multiplex = denom / fraction[1][i];
            fraction[0][i] = fraction[0][i] * multiplex;
            fraction[1][i] = denom;
        }



        for (int[] arr : fraction) {
            for (int elem : arr) {
                System.out.print(elem + "\t\t");
            }
            System.out.println();
        }
    }
}
