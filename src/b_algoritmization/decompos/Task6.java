package b_algoritmization.decompos;

import java.util.Scanner;

public class Task6 {
    /*
    Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        //целые числа взаимно просты, если их наибольший общий делитель (НОД) равен 1
        int simple = gcf(gcf(n1, n2), n3);
        if (simple == 1) {
            System.out.println("Числа взаимно простые");
        } else {
            System.out.println("Числа не являются взаимно простыми");
        }
        //System.out.println(gcf(50, 30));
    }
    private static int gcf(int a, int b) {
        int max = Math.min(a, b);
        while (a % max != 0 || b % max != 0) {
            max--;
        }
        return max;
    }
}
