package basic.p7;
/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.
 */
public class Main {
    public static void main(String[] args) {
        int a1=60, a2=30;
        if ((a1+a2) < 180) {
            if ( a1==90 | a2==90 |(a1+a2)==90 ) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник не прямоугольный");
            }
        } else {
            System.out.println("Треугольник не существует");

        }
    }
}
