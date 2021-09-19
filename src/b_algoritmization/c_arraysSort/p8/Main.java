package b_algoritmization.c_arraysSort.p8;

import java.util.Arrays;

/*
Даны дроби p1/q1, p2/q2, ... pn/qn, ( pi , qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */
public class Main {
    private static final int MULTIPLIERS_COUNT = 100;

    public static void main(String[] args) {
        int[][] fraction = {
                {8, 7, 12, 63, 23},
                {11, 8, 14, 98, 28}};

        int nokMax = 1;
        for (int i = 0; i < fraction[1].length; i++) {
            nokMax *= fraction[1][i];
        }
        //метод нахождения НОК
        System.out.println(Arrays.toString(getMultipliers(540)));
        //System.out.println(Arrays.toString(toUnique(getMultipliers(540))));
    }

    public static int[] getDivisors(int x) {
        int[] array = new int[x + 1];
        int cap = 0;
        for (int i = 2; i <= array.length; i++) {
            if (x % i == 0) {
                array[i] = i;
                cap++;
            }
        }
        int[] result = new int[cap];
        for (int i = 2, k = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result[k] = array[i];
                k++;
            }
        }
        return result;
    }

    public static int[] getMultipliers(int x) {
        int[] divisors = getDivisors(x);
        int[] multipliers = new int[MULTIPLIERS_COUNT];
        int cap = 0;
        for (int i = 0; i < divisors.length; i++) {
            while (x % divisors[i] == 0) {
                multipliers[cap] = divisors[i];
                x = x / divisors[i];
                cap++;
            }
        }
        multipliers = Arrays.copyOf(multipliers, cap);
        return multipliers;
    }

    public static int[] toUnique(int[] array) {
        Arrays.sort(array);
        int[] tmpArray = new int[MULTIPLIERS_COUNT];
        tmpArray[0] = array[0];
        int cap = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                tmpArray[cap] = array[i];
                cap++;
            }
        }
        tmpArray = Arrays.copyOf(tmpArray, cap);
        return tmpArray;
    }

    public static int[] getNok(int[] array) {//массив знаменателей
        Arrays.sort(array);
        int max = array[array.length - 1];
        int[] maxArray = getMultipliers(max);
        int[] tmp = new int[MULTIPLIERS_COUNT];
        for (int i = 0; i < array.length - 1; i++) {
            tmp = getMultipliers(array[i]);

        }

        return new int[]{1};
    }
}
