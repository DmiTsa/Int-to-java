package a_basicsOfSoftwareCodeDevelopment.c_cycles;

import java.util.Scanner;

public class Task2 {
    // Вычислить значения функции {y=x при x>2, y=-x при x<=2} на отрезке [а, b] c шагом h
    public static void main(String[] args) {
        System.out.println("Введите диапазон - от a до b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Введите шаг");
        int h = sc.nextInt();

        for (int i = a; i <= b; i += h) {
            int y;
            if (i > 2) {
                y = i;
            } else {
                y = -1 * i;
            }
            System.out.print(y + " ");

        }
    }
}
