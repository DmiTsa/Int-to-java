package c_stringAndBasicsOfTextProcessing.b_stringsHowStringbuilder;

public class Task4 {

        //С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
        public static void main(String[] args) {
            String beginString = "информатика";

            char partOne = beginString.charAt(7);
            char partTwo = beginString.charAt(3);
            char partThree = beginString.charAt(4);

            System.out.println(""+partOne + partTwo + partThree + partOne);
        }
}
