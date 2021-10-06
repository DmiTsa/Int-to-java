package c_stringAndBasicsOfTextProcessing.b_stringsHowStringbuilder;

import java.util.Scanner;

public class Task8 {
    // Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
    //длинных слов может быть несколько, не обрабатывать.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int wordLength = 0;
        int wordIndex = 0;
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            int tmp = words[i].length();
            if (tmp > wordLength) {
                wordLength = tmp;
                wordIndex = i;
            }
        }
        System.out.println("Самое длинное слово: " + words[wordIndex]);
    }
}
