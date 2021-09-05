package basic.p19;

import java.util.Scanner;

/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите два числа ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1 + s2);


        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    System.out.print(s1.charAt(i) + "  ");
                }
            }
        }

        // System.out.println(s1 + s2);
    }
}
