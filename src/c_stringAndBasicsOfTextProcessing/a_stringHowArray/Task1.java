package c_stringAndBasicsOfTextProcessing.a_stringHowArray;

import java.util.Arrays;

public class Task1 {
    /*
     Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
     */
    public static void main(String[] args) {
        String[] variables = {"oneVar", "twoVar", "threeVar"};

        String s;
        for (int i = 0; i < variables.length; i++) {
            s = variables[i];
            for (int j = 0; j < s.length(); j++) {
                if (Character.isUpperCase(s.charAt(j))) {
                    String tmp = s.substring(0, j) + "_" + s.substring(j);
                    variables[i] = tmp.toLowerCase();
                }
            }
        }
        System.out.println(Arrays.toString(variables));
    }
}
