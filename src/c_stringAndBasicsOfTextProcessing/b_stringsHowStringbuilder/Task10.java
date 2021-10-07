package c_stringAndBasicsOfTextProcessing.b_stringsHowStringbuilder;

public class Task10 {
    //Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
    //знаком. Определить количество предложений в строке X
    public static void main(String[] args) {
        String s = "Oh! Jawa! is cool . Or no?";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == '!' ||s.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("Text contains " + count + " sentenses");
    }
}
