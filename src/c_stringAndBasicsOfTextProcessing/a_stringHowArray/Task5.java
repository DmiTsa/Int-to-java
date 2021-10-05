package c_stringAndBasicsOfTextProcessing.a_stringHowArray;

public class Task5 {
    /*
    Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
     */
    public static void main(String[] args) {
        String s = "  Ring     of     power ";

        s= s.trim();
        while (s.contains("  ")) {
           s = s.replace("  "," ");
        }
        System.out.println(s);
    }
}