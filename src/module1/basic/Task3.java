package module1.basic;
//��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������)
//(sin x + cos y) / (cos x - sin y) * tg x y
public class Task3 {
	public static void main (String[] arg) {
	double x = 30;
	double y = 60;
	double rezult;

	rezult = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
	rezult *= Math.tan(x * y);
	System.out.print(rezult);
	}
}
