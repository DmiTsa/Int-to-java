package b_algoritmization.decompos;

import java.util.Scanner;

/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину стороны");
        double a = sc.nextDouble();
        double s = 6 * areaTriangle(a);
        System.out.println("площадь шестиугольника = " + s);
    }

    public static double areaTriangle(double a) {
        //S = a2 : 2 * (sin(α)⋅sin(β)) : sin(180 — (α + β))
        int angleA = 30;
        int angleB = 30;
        return Math.pow(a, 2) / 2 * (Math.sin(angleA)*Math.sin(angleB)/Math.sin(180 - (angleA+angleB)));
    }
}