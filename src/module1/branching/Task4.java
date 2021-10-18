package module1.branching;

import java.util.Scanner;

//������ ������� �, � �������������� ��������� � ������� �, �, z �������.
//����������, ������� �� ������ ����� ���������.
public class Task4 {

	public static void main(String[] args) {
		System.out.println("������� ������� �������");
		Scanner scanner = new Scanner (System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		System.out.println("������� ������ ���������");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		
		int minSize = Math.min(x, Math.min(y, z));
		int maxSize = Math.max(x, Math.max(y, z));
		int midSize = (x + y + z) - minSize - maxSize;
		
		if (minSize < Math.min(a, b) && midSize < Math.max(a, b)) {
				System.out.print("�������");
		} else {
			System.out.print("�� �������");
		}
	}
}
