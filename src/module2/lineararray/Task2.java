package module2.lineararray;

/*
Дана последовательность действительных чисел а1, а2, ... ,аn.
Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
*/
public class Task2 {
	public static void main(String[] args) {
		double[] array;
		double numberReplace;
		int countReplace;

		{
			array = new double[] { 5.4, 3, -7.8, 5.8, 48 };
			numberReplace = 5.1;
			countReplace = 0;
		}

		System.out.println("Начальный массив");
		outputRealConsole(array);

		for (int i = 0; i < array.length; i++) {
			if (array[i] > numberReplace) {
				array[i] = numberReplace;
				countReplace++;
			}
		}

		System.out.println("Новый массив");
		outputRealConsole(array);
		System.out.println("Произведено " + countReplace + " замен(ы)");

	}

	private static void outputRealConsole(double array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
