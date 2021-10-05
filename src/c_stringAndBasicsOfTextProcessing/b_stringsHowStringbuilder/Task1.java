package c_stringAndBasicsOfTextProcessing.b_stringsHowStringbuilder;

public class Task1 {
    //Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
    public static void main(String[] args) {
        String s = " String is        text  format.";

        int count=0;
        int tmp=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                tmp++;
            } else {
                if (count < tmp) {
                    count = tmp;
                };
                tmp=0;
            }
        }
        System.out.println("Наибольшее количество пробелов: " + count);
    }
}
