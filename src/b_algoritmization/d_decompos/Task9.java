package b_algoritmization.d_decompos;

import java.util.Scanner;

public class Task9 {
    /*
    Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y — прямой.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Введите стороны четырехугольника");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double t = sc.nextDouble();

        double area1 = areaTriagle(x, y, hypoLength(x, y));
        double area2 = areaTriagle(hypoLength(x, y), z, t);

        System.out.println("Площадь четырехугольника равна "+ (area1 + area2));
    }

    private static double hypoLength(double a, double b) {
        return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    }

    private static double areaTriagle(double a, double b, double c) {
        double pp = (a + b + c) / 2;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}
