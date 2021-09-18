package a_basicsOfSoftwareCodeDevelopment.c_cycles;

import java.util.Scanner;

public class Task7 {
    /*
   Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
   m и n вводятся с клавиатуры.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите начало промежутка: от ");
        int m = sc.nextInt();
        System.out.print("Введите конец промежутка: до ");
        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.print(i + " : ");
            for (int j = 2; j < n; j++) {
                if ((i % j == 0) && (i != j)) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}
