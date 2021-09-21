package b_algoritmization.decompos;

public class Task4 {
    /*
На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние.
Указание: Координаты точек занести в массив.
*/
    public static void main(String[] args) {
        int[] coordinates = {15, 16, -2, -13, 18, 29, -17, 30};
        int num1 = 0, num2 = 0;
        double distMax = 0;
        for (int i = 0; i < coordinates.length - 2; i += 2) {
            for (int j = i + 2; j < coordinates.length; j += 2) {
                double tmp = distBetweenTwoPoint(coordinates[i], coordinates[i + 1], coordinates[j], coordinates[j + 1]);
                if (tmp > distMax) {
                    num1 = (i + 2) / 2;
                    num2 = (j + 2) / 2;
                    distMax = tmp;
                }
            }
        }
        System.out.println("Наибольшее расстояние между точками " + num1 + " и " + num2 + ". Равное " + String.format("%.3f", distMax));
    }

    public static double distBetweenTwoPoint(int x1, int y1, int x2, int y2) {
        //sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
