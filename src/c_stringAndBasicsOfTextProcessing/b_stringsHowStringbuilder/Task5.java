package c_stringAndBasicsOfTextProcessing.b_stringsHowStringbuilder;

public class Task5 {
    //Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
    public static void main(String[] args) {
        String string = "java is really power";

        int count =0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Буква а встречается " + count + " раз(а)");
    }
}
