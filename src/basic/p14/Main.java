package basic.p14;

/*
 Найти сумму квадратов первых ста чисел.
 */
public class Main {
    public static void main(String[] args) {
        double sum=0;
        for (int i = 1; i <= 100; i++)
            sum += Math.pow(i, 2);
        System.out.println(sum);
    }
}
