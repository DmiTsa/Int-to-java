package a_basicsOfSoftwareCodeDevelopment.b_branchings;

public class Task5 {
    //Вычислить значение функции
    public static void main(String[] args) {
        double x = 2;
        if (x <= 3) {
            System.out.println((Math.pow(x, 2) - (3 * x)) + 9);
        } else {
            System.out.println(1 / (Math.pow(x, 3) + 6));
        }
    }
}
