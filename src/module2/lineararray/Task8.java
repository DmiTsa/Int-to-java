package module2.lineararray;

//Дана последовательность целых чисел a1, a2, ... an. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min (a1, a2, ... an).
public class Task8 {

	public static void main(String[] args) {
		int[] array;
		int[] rezultArray;
		int rezultArrayIndex;
		int rezultArraySize;
		int min;

		{
			array = new int[] { 7, -5, 50, 40, -5, 15 };
			min = array[0];
			rezultArraySize = array.length;
			rezultArrayIndex = 0;
		}

		for (int ar : array) {
			min = (ar <= min) ? ar : min;
		}

		for (int ar : array)
			if (ar == min) {
				rezultArraySize--;
			}

		rezultArray = new int[rezultArraySize];

		for (int i = 0; i < array.length; i++) {
			if (array[i] != min) {
				rezultArray[rezultArrayIndex] = array[i];
				rezultArrayIndex++;
			}
		}

		System.out.println("Исходный массив");
		outputIntegerConsole(array);

		System.out.println("Новый массив");
		outputIntegerConsole(rezultArray);
	}

	private static void outputIntegerConsole(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}