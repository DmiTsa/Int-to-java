package module1.basic;

//����  �����������  ����� �, �������  ������������  ������������  ����������  �������
//�  ��������.  ������� ������ �������� ������������ � �����, ������� � �������� 
//� ��������� �����:��� ����� SSc.
public class Task5 {

	public static void main(String[] args) {
		int time = 24554;
		int h, m, s;
		
		h = time / 3600;
		m = (time - h * 3600) / 60;
		s = time - h * 3600 - m * 60;
		
		String sh = "0" + h;
		String sm = "0" + m;
		String ss = "0" + s;
	        
		System.out.print(sh.substring(sh.length() - 2) + " � ");
		System.out.print(sm.substring(sm.length() - 2) + " ��� ");
		System.out.print(ss.substring(ss.length() - 2) + " c.");
	}
}
