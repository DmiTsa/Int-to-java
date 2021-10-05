package c_stringAndBasicsOfTextProcessing.b_stringsHowStringbuilder;

public class Task6 {
    //Из заданной строки получить новую, повторив каждый символ дважды.
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java 1.8!");

        for (int i=0;i<sb.length();i+=2) {
            sb.insert(i,sb.charAt(i));
        }
        System.out.println(sb);
    }
}
