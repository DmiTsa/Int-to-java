package a_basicsOfSoftwareCodeDevelopment.p10;

/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */
public class Main {
    public static void main(String[] args) {
        int A = 40, B = 151;
        int x = 20, y = 151, z = 230;
        //находим любые два минимальные размера кирпича
        int m1 = 0, m2 = 0; //m1<m2 всегда
        if (Math.min(Math.min(x, y), z) == x) {
            m1 = x;
            m2 = Math.min(y, z);
        }
        if (Math.min(Math.min(x, y), z) == y) {
            m1 = y;
            m2 = Math.min(x, z);
        }
        if (Math.min(Math.min(x, y), z) == z) {
            m1 = z;
            m2 = Math.min(x, y);
        }
        if ((A < B & m1 <= A & m2 <= B) | (B < A & m1 <= B & m2 <= A)) {
            System.out.println("Кирпич пройдет");
        } else {
            System.out.println("Кирпич не пройдет");
        }
    }
}