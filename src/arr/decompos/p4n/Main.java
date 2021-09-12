package arr.decompos.p4n;

import java.util.Scanner;

/*
На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние.
Указание: Координаты точек занести в массив.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество точек ");
        int nP = sc.nextInt();
        int[][] coord = new int[nP][2];

        System.out.println("задайте координаты");
        for (int i = 0; i < nP; i++) {
            System.out.println("Точка № " + (i + 1) + " :");
            for (int j = 0; j < 2; j++) {
                coord[i][j] = sc.nextInt();
            }
        }

        int pointA = 0, pointB = 0;
        double dist = 0;

//        for (int i = 1; i <= nP; i++) {
//            pointA = i;
//            for (int j = 0; j < nP; j++) {
//                pointB = j;
//                dist = distBetweenTwoPoint(coord[i][],coord[i][],coord[][] ,coord[][] );
//            }
//        }
//        System.out.println(dist);


    }

    public static double distBetweenTwoPoint(int x1, int y1, int x2, int y2) {
        //sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }
}
