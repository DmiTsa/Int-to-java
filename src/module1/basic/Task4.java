package module1.basic;

//���� �������������� ����� R���� nnn.ddd(��� �������� ������� � ������� � ����� ������).
//�������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		System.out.println("������� �����");
		Scanner scanner = new Scanner (System.in);
		double value = scanner.nextDouble();
		scanner.close();
		
		int integerPart;
		double rezultNumber;
		
		integerPart = (int) value;//123
		rezultNumber = (int) ( ( value - integerPart ) * 1000 );
		rezultNumber += integerPart / 1000d;
		System.out.println ("��������� = " + rezultNumber);
	}

}
