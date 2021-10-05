package c_stringAndBasicsOfTextProcessing.b_stringsHowStringbuilder;

public class Task7 {
    // Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было
    // введено "abc cdedef", то должно быть выведено "abcdef".
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc cdedef");

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
                i--;
            } else if (sb.substring(0, i).contains("" + sb.charAt(i))) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}
