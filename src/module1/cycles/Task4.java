package module1.cycles;

import java.math.BigInteger;
//Составить программу нахождения произведения квадратов первых двухсот чисел
public class Task4 {

	public static void main(String[] args) {
		BigInteger rezult = new BigInteger("1");
		
		for (int i = 1; i <= 100; i++) {
			//rezult = rezult +1;
			rezult = rezult.multiply(BigInteger.valueOf(i*i));
		}
		System.out.println(rezult);
	}

}
