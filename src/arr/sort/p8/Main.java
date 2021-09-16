package arr.sort.p8;

import java.util.Arrays;

/*
Даны дроби p1/q1, p2/q2, ... pn/qn, ( pi , qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */
public class Main {
    public static void main(String[] args) {
        int[][] fraction = {
                {8, 7, 12, 63, 23},
                {11, 8, 14, 98, 28}};

        int nokMax = 1;
        for (int i = 0; i < fraction[1].length; i++) {
            nokMax *= fraction[1][i];
        }
        //метод разложения числа на множители

        System.out.println(Arrays.toString(getMultipliers(40)));
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
        int[] multipliers = new int[20];
        int cap = 0;
        for (int i = 0; i < divisors.length; i++) {
            while (x % divisors[i] == 0) {
                multipliers[cap] = divisors[i];
                x = x - (x / divisors[i]);
                cap++;
            }
        }
        multipliers = Arrays.copyOf(multipliers, cap);
        return multipliers;
    }
}
