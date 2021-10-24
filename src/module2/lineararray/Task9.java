package module2.lineararray;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

public class Task9 {

	public static void main(String[] args) {
		int[] array;
		int[] arrayRepeat; // массив повторяемости элементов массива array
		int maxElementRepeat;
		int minRezult;
		int minCurrent;

		{
			array = new int[] { 20, 18, 5, 18, 9, 20, 4, 6, 2, 9, 9 };
			arrayRepeat = new int[array.length];
			minCurrent = array[0];
			minRezult = array[0];
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j])
					arrayRepeat[i]++;
			}
		}

		maxElementRepeat = maxOfIntegerArray(arrayRepeat);

		for (int i = 0; i < arrayRepeat.length; i++) {

			if (arrayRepeat[i] == maxElementRepeat) {
				minCurrent = array[i];
				minRezult = (minCurrent < minRezult) ? minCurrent : minRezult;
			}
		}

		System.out.println("Наименьшее часто повторяющееся: " + minRezult);
		
	}
	
	private static int maxOfIntegerArray(int array[]) {
		int max;
		max = 0;

		for (int i : array) {
			max = (i > max) ? i : max;
		}

		return max;
	}
}
