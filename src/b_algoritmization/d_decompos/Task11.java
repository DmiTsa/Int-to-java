package b_algoritmization.d_decompos;

public class Task11 {
    /*
    Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
     */
    public static void main(String[] args) {
        int num1 = 8554447;
        int num2 = 854195;

        if (countDigits(num1) > countDigits(num2)) {
            System.out.println("Цифр больше в числе 1");
        } else if (countDigits(num1) < countDigits(num2)){
            System.out.println("Цифр больше в числе 2");
        } else {
            System.out.println("Количество цифр в числах одинаково");
        }
    }

    private static int countDigits(int x) {
        int d = 0;
        double del = 10;
        while (del > 1) {
            del = x / Math.pow(10, d);
            d++;
        }
        return d - 1;
    }

}
