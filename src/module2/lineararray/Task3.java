package module2.lineararray;

public class Task3 {
	/*
	 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
	 * в нем отрицательных, положительных и нулевых элементов.
	 */
	public static void main(String[] args) {
		double[] array;
		int countPos;
		int countNeg;
		int countZero;

		{
			array = new double[] { -54.1, -12, 0, -4.8, 2.5, 5.5, 6, 6.1, 0, -82 };
			countPos = 0;
			countNeg = 0;
			countZero = 0;
		}

		for (double ar : array) {
			if (ar == 0) {
				countZero++;
			}
			if (ar > 0) {
				countPos++;
			}
			if (ar < 0) {
				countNeg++;
			}
		}
		
		System.out.println("Положительных элементов: " + countPos);
		System.out.println("Отрицательных элементов: " + countNeg);
		System.out.println("Нулевых элементов: " + countZero);
	}
}
