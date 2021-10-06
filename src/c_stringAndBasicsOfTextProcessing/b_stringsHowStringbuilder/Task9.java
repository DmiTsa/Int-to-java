package c_stringAndBasicsOfTextProcessing.b_stringsHowStringbuilder;

import java.util.Scanner;

public class Task9 {
    //Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
    // Учитывать только английские буквы.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int loverCase = 0;
        int upperCase = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("abcdefghijklmnopqrstuvwxyz".contains("" + s.charAt(i))) {
                loverCase++;
            }
            if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains("" + s.charAt(i))) {
                upperCase++;
            }
        }
        System.out.println("Строчных букв: " + loverCase + " прописных букв " + upperCase);
    }
}
