package a_basicsOfSoftwareCodeDevelopment.c_cycles;

public class Task3 {
    // Найти сумму квадратов первых ста чисел.
    public static void main(String[] args) {
        double sum=0;
        for (int i = 1; i <= 100; i++)
            sum += Math.pow(i, 2);
        System.out.println(sum);
    }
}
