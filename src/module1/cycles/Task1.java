package module1.cycles;

import java.util.Scanner;

//�������� ���������, ��� ������������ ������ ����� ����� ������������� �����. � ���������
//��������� ��� ����� �� 1 �� ���������� ������������� �����.
public class Task1 {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ����� ������������� �����");
		int x = scanner.nextInt();
		scanner.close();
		
		int sum = 0;
		for (int i =1; i <= x; i++) {
			sum += i;
		}
		System.out.println("��������� " + sum);
	}
}
