package a_basicsOfSoftwareCodeDevelopment.a_linearProgramms;

public class Task2 {
    // Вычислить значение выражения по формуле. Все переменные действительные числа.
    public static void main(String[] args) {
        double a = 4, b = 5, c = 6;
        double res;
        res = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.print(res);
    }
}
