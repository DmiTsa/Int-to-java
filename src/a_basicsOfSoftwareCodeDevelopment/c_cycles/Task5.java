package a_basicsOfSoftwareCodeDevelopment.c_cycles;

import java.util.Scanner;

public class Task5 {
    /*
 Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид An=1/2(n) + 1/3(n)
 */
    public static void main(String[] args) {
        double sum = 0, nn;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число членов ряда: ");
        int n = sc.nextInt();
        System.out.print("Введите заданное число е: ");
        double e = sc.nextDouble();
        for (int i = 1; i <= e; i++) {
            nn = 1 / i * i + 1 / Math.pow(3, i);
            System.out.println("Член ряда № " + i + " = " + nn);
            if (Math.abs(nn) >= e) {
                sum += nn;
            }
        }
        System.out.println("Сумма = " + sum);
    }
}
