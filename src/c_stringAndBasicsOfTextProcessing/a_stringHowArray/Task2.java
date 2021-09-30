package c_stringAndBasicsOfTextProcessing.a_stringHowArray;

public class Task2 {
    // Замените в строке все вхождения 'word' на 'letter'
    public static void main(String[] args) {
        String s = "One word of java. This is a great word.";

        s = s.replace("word", "letter");
        System.out.println(s);
    }
}
