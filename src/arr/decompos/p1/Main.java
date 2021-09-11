package arr.decompos.p1;

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
        System.out.println(NOK(a, b));
    }

    public static int NOK(int a, int b) {
        return (a * b) / NOD(a, b);
    }
    public static int NOD(int a, int b) {
        if (a > b){
            a = a % b;
        }



        return ;
    }
}
