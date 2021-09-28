package b_algoritmization.d_decompos;

import java.util.Arrays;

public class Task13 {
    /*
    Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.
     */
    public static void main(String[] args) {
        int n = 11; //отрезок n...2n  =6-12

        int[] array =  getSimpleArray(n);
        for (int i = 0; i < array.length-1; i++) {
                if (array[i+1]-array[i]==2){
                    System.out.println("Пара близнецов: "+array[i]+" "+array[i+1]);
                }
        }
    }

    public static int[] getSimpleArray(int begin) {//n=6
        int size = 0;
        for (int i = begin; i <= 2*begin; i++) {
            if (isPrime(i)) {
                size++;
            }
        }
        int[] array = new int[size];
        for (int i = begin,j=0; i <= 2*begin; i++) {
            if (isPrime(i)) {
                array[j]=i;
                j++;
            }
        }
        return array;
    }

    public static boolean isPrime(int x) {
        boolean flag = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}
