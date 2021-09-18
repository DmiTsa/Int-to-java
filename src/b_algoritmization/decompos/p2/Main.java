package b_algoritmization.decompos.p2;

import java.util.Scanner;

/*
 Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 4 числа для нахождения НОД");
        Scanner sc = new Scanner((System.in));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("НОД = " + nod(nod (a,b), nod (c, d)));
    }
    public static int nod (int a, int b) {
        while ((a != 0) & (b != 0)) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a + b);
    }
}
