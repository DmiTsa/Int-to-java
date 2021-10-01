package c_stringAndBasicsOfTextProcessing.a_stringHowArray;

public class Task4 {
    //В строке найти количество чисел
    public static void main(String[] args) {
        String s = "String № 450 ,next 451 in 4 ... ";

        int beginPos = 0;
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            String tmp = "";
            if (s.charAt(i) == ' ') {
               tmp = s.substring(beginPos, i);
               if (isNumber(tmp)) {
                   count++;
               }
               beginPos = i+1;
            }
        }
        System.out.println("Количество чисел " + count);
    }
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

