package a_basicsOfSoftwareCodeDevelopment.b_branchings;

public class Task3 {
    //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void main(String[] args) {
        //вычисление через площадь треугольника по 3 точкам S= 1/2(x2-x1)(y3-y1)-(x3-x1)(y2-y1)
        int x1 = 1, y1 = 1;
        int x2 = 0, y2 = 0;
        int x3 = -1, y3 = -1;
        if ((((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2) != 0) {
            System.out.println("Точки не лежат на одной прямой");
        } else {
            System.out.println("Точки лежат на одной прямой");
        }
    }
}
