package b_algoritmization.d_decompos;

public class Task12n {
    /*
    Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.
     */
    public static void main(String[] args) {
        int k = 30; //сумма цифр массива равна k
        int n = 100; // числа не больше n
        int[] a = new int[0];

        System.out.println(randomBefore(1));
    }
    public  static int randomBefore (int n){ //выдает случайное число до указанного значения (включительно)
        return (int) (Math.random()*n+1);
    }
}
