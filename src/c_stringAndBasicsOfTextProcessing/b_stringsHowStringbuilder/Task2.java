package c_stringAndBasicsOfTextProcessing.b_stringsHowStringbuilder;

public class Task2 {
    // В строке вставить после каждого символа 'a' символ 'b'
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Maps of magic area");

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.insert(i+1, 'b');
                i++;
            }
        }
        System.out.println(sb);
    }
}
