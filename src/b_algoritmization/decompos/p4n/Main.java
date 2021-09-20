package b_algoritmization.decompos.p4n;


public class Main {
    /*
На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние.
Указание: Координаты точек занести в массив.
 */
    public static void main(String[] args) {
        int[] coordinates = {4, 6, 7, -2, 18, 12, -9, -1};

        int num1, num2;
        double distMax = 0;
        for (int i = 0; i < coordinates.length - 2; i += 2) {
            for (int j = i + 2; j < coordinates.length; j += 2) {
                double tmp = distBetweenTwoPoint(coordinates[i], coordinates[i+1], coordinates[j], coordinates[j + 1]);

            }
        }
        System.out.println("Сверить");
        System.out.println(distBetweenTwoPoint(4,6,7,-2));
        System.out.println(distBetweenTwoPoint(4,6,18,12));
        System.out.println(distBetweenTwoPoint(4,6,-9,-1));
        System.out.println(distBetweenTwoPoint(7,-2,18,12));
        System.out.println(distBetweenTwoPoint(7,-2,-9,-1));
        System.out.println(distBetweenTwoPoint(18,12,-9,-1));


        //System.out.println(distBetweenTwoPoint(4, 2, 6, -1));
    }

    public static double distBetweenTwoPoint(int x1, int y1, int x2, int y2) {
        //sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }
}
