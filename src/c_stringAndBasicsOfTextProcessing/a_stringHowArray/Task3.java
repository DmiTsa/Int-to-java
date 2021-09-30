package c_stringAndBasicsOfTextProcessing.a_stringHowArray;

public class Task3 {
    //В строке найти количество цифр.
    public static void main(String[] args) {
        String s = "Today is 10, tomorrow is 11";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("0123456789".contains(String.valueOf(s.charAt(i)))) {
                count++;
            }
        }
        System.out.println("Количество цифр " + count);
    }
}