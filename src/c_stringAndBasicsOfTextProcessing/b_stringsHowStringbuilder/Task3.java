package c_stringAndBasicsOfTextProcessing.b_stringsHowStringbuilder;

public class Task3 {
    // Проверить, является ли заданное слово палиндромом
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("казак");

        StringBuilder sbOriginal = new StringBuilder(sb);
        sb.reverse();
        boolean isPalindrome = sb.toString().equals(sbOriginal.toString());
        if (isPalindrome) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
