package module2.lineararray;

// Даны действительные числа а1, а2, ... ,аn. Поменять местами наибольший и
// наименьший элементы.
public class Task4 {
	public static void main(String[] args) {
		double[] array;
		int minIndex;
		int maxIndex;

		{
			array = new double[] { 50.5, -500.4, 65, -5.9, 412.7, 6, -8, 1.9 };
			minIndex = 0;
			maxIndex = 0;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= array[maxIndex])
				maxIndex = i;
			if (array[i] <= array[minIndex])
				minIndex = i;
		}
		
		double tmp;
		tmp = array[maxIndex];
		array[maxIndex] = array[minIndex];
		array[minIndex] = tmp;

		outputRealConsole(array);
	}
	private static void outputRealConsole(double array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}