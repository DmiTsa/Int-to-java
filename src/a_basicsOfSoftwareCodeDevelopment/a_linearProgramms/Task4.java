package a_basicsOfSoftwareCodeDevelopment.a_linearProgramms;

public class Task4 {/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

    public static void main(String[] args) {
        double r = 149.999;
        //int x1 = (int) ((r % 1) * 1000);
        int intPart = (int)Math.round( (r - (int)r) * 1000);
        double fracPart = (double) ((int) r) / 1000;
        System.out.println("Выходное число " + (intPart + fracPart));
    }
}
