package module2.lineararray;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.
public class Task6 {

	public static void main(String[] args) {
		int[] array;
		int sum;

		{
			array = new int[] { 10, 10, 10, 10, 1, 10, 1, 10, 1, 1, 1 };
			sum = 0;
		}

		for (int i = 0; i < array.length; i++) {
			if (isSimple(i)) {
				sum += array[i];
			}
		}

		System.out.println("Сумма элементов = " + sum);
	}

	public static boolean isSimple(int number) {

		boolean flag;
		flag = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
