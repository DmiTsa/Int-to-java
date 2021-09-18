package b_algoritmization.a_oneDimentionArrays;

public class Task5 {
    //Даны целые числа а1, а2, ... ,аn. Вывести на печать только те числа, для которых аi > i
    public static void main(String[] args) {
        int[] arr = {4, 0, 66, -4, -15, 20};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
