package basic.p15;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.math.BigInteger;

/*
Составить программу нахождения произведения квадратов первых двухсот чисел
 */
public class Main {
    public static void main(String[] args) {
        BigInteger prod = new BigInteger("1");
        int i;
        for (i = 1; i <= 200; i++)
            prod = prod.multiply(BigInteger.valueOf(i*i));
        System.out.println(prod);
    }
}
