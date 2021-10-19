package module1.cycles;

import java.util.Scanner;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Task8n {

	public static void main(String[] args) {
		double numberOne;
		double numberTwo;
		String convertString1;
		String convertString2;
		
        System.out.print("Введите два целых числа");
        numberOne = getDoubleFromConsole();
        numberTwo = getDoubleFromConsole();
        
        convertString1 = Double.toString(numberOne);
        convertString2 = Double.toString(numberTwo);

        for (int i = 0; i < convertString1.length(); i++) {
        	
            for (int j = 0; j < convertString2.length(); j++) {
                if (convertString1.charAt(i) == convertString2.charAt(j)) {
                    System.out.print(convertString1.charAt(i) + "  ");
                }
                
            }
        }
    }
	private static double getDoubleFromConsole() {
		double value;

		System.out.print(">");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println("Неверный ввод! Повторите");
			System.out.print(">");
		}

		value = scanner.nextDouble();

		return value;
	}
}