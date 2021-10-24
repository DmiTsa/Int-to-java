package module2.lineararray;
//Даны действительные числа а1...an. Найти max ( a1 + an, a2 + a(n-1), ...  an + a(n+1) )

public class Task7 {

	public static void main(String[] args) {
		double[] array;
		double max;
		double currentMax;
		int midIndex;

		{
			array = new double[] { 5.5, -41.8, 1.9, 27, 4.7, -8 };
			max = 0d;
			currentMax = 0d;
		}

		midIndex = array.length / 2;

		for (int i = 0; i < midIndex; i++) {
			currentMax = array[i] + array[array.length - i - 1];
			max = (currentMax > max) ? currentMax : max;
		}
	
		System.out.println("Максимальная сумма элементов = " + max);
	}
}