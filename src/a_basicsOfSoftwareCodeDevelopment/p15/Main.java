package a_basicsOfSoftwareCodeDevelopment.p15;

import java.math.BigInteger;

/*
Составить программу нахождения произведения квадратов первых двухсот чисел
 */
public class Main {
    public static void main(String[] args) {
        BigInteger ml = new BigInteger("1");
        int i;
        for (i = 1; i <= 200; i++)
            ml = ml.multiply(BigInteger.valueOf(i*i));
        System.out.println(ml);
    }
}
