package a_basicsOfSoftwareCodeDevelopment.p8;

/*
Найти max{min(a, b), min(c, d)}
 */
public class Main {
    public static void main(String[] args) {
        int min1, min2, max;
        int a = 2, b = 4, c = -2, d = 14;
        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }
        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }
        System.out.println(max);
    }
}
