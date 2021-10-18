package module1.basic;

//Дано действительное число Rвида nnn.ddd(три цифровых разряда в дробной и целой частях).
//Поменять местами дробную и целую части числа и вывести полученное значение числа.
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		System.out.println("Введите число");
		Scanner scanner = new Scanner (System.in);
		double value = scanner.nextDouble();
		scanner.close();
		
		int integerPart;
		double rezultNumber;
		
		integerPart = (int) value;//123
		rezultNumber = (int) ( ( value - integerPart ) * 1000 );
		rezultNumber += integerPart / 1000d;
		System.out.println ("Результат = " + rezultNumber);
	}

}
