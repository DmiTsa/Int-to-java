package b_algoritmization.a_oneDimentionArrays.p5;
/*
Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
 */
public class Task5 {
    public static void main(String[] args) {
int[] arr = new int[]{4,0,66,-4,-15,20};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) System.out.println(arr[i]);
        }
    }
}
