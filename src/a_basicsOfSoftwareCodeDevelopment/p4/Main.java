package a_basicsOfSoftwareCodeDevelopment.p4;

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
public class Main {
    public static void main(String[] args) {
        float r = 123.567f;
        int x1 = (int) ((r % 1) * 1000);             //новая целая часть
        float x2 = (float) ((int) r) / 1000;    //новая дробная часть
        System.out.println("Выходное число " + (x1 + x2));
    }
}
