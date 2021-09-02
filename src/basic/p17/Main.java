package basic.p17;

/*
 Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Main {
    public static void main(String[] args) {
//выводим кодировку до 1400 симв
        int n = 1400;
        System.out.println("Символ| Код");
        for (int i = 1; i <= n; i++) {
            System.out.println((char) i + " | " + i);
        }
    }
}