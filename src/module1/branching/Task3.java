package module1.branching;

//���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). 
//����������, ����� �� ��� ����������� �� ����� ������.
public class Task3 {

	public static void main(String[] args) {
		int x1 = 1, y1 = 1;
		int x2 = 2, y2 = 2;
		int x3 = 3, y3 = 3;

		boolean isOneLine;
		isOneLine = ((((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2) == 0);
		
		if (isOneLine) {
			System.out.println ("�� ����� ������");
		} else {
			System.out.println ("�� �� ����� ������");
		}
	}
}
