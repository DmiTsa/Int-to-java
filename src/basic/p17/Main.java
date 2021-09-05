package basic.p17;

/*
 Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Main {
    public static void main(String[] args) {
//выводим русских символов (коды UTF от 1040 - 1103)
        char n1 = 1040;
        char n2 = 1103;
        System.out.println("Символ\t|  Код");
        for (char i = n1; i <= n2; i++) {
            System.out.println(i + "\t\t| " + (int) i);
        }
    }
}