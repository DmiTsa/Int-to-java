package module1.basic;

import java.util.Scanner;

//Для данной области составить линейную программу, которая печатает true, если точка 
//с координатами (х, у) принадлежит закрашенной области, и false—в противном случае
public class Task6 {
	public static void main(String[] args) {
		System.out.println("Введите координаты");
		Scanner scanner = new Scanner (System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();
		
		boolean firstArea = false;
		boolean secondArea = false;
		
		firstArea = ((x <= 2 && x >= -2) && (y <= 4 && y >= 0));
		secondArea = ((x <= 4 && x >= -4) & (y <= 0 && y >= -3));
		
		System.out.println(firstArea || secondArea);
	}
}