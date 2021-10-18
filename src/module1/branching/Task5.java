package module1.branching;
//Вычислить значение функции
import java.util.Scanner; 
public class Task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите x");
		double x = scanner.nextDouble();
		scanner.close();
		
		double rezult;
		if (x <= 3) {
			rezult = Math.pow(x, 2) - 3 * x + 9;
		} else {
			rezult = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println("Результат: " + rezult);
	}
}
