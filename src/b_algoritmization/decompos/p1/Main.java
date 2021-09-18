package b_algoritmization.decompos.p1;

import java.util.Scanner;

/*
 Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел НОК(a b) = a * b / НОД(a b)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа - A и B");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("НОК для " + a + " и " + b + " равен " + nok(a, b));
    }

    public static int nok (int a, int b) {
        return (a * b) / nod(a, b);
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

