package module1.branching;

import java.util.Scanner;

//���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������,
//� ���� ��, �� ����� �� �� �������������.
public class Task1 {

	public static void main(String[] args) {
		System.out.println("������� ��� ���� � ��������");
		Scanner scanner = new Scanner (System.in);
		int angle1 = scanner.nextInt();
		int angle2 = scanner.nextInt();
		scanner.close();

		if ( (angle1 + angle2) < 180 ) {
			System.out.print("����������� ����������");
			if (angle1 == 90 || angle2 == 90 || (angle1 + angle2) == 90) {
				System.out.print(" .�������������");
			} else {
				System.out.print(" .�� �������������");
			}
		} else {
			System.out.print("����������� �� ����������");
		}
		
	}

}
