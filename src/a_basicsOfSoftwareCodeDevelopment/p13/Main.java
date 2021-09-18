package a_basicsOfSoftwareCodeDevelopment.p13;

import java.util.Scanner;

/*
 Вычислить значения функции на отрезке [а,b] c шагом h
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите диапазон - от a до b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Введите шаг");
        int h = sc.nextInt();

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                int y = i;
                System.out.print(y + " ");
            } else {
                int y = -1 * i;
                System.out.print(y + " ");
            }

        }
    }
}
