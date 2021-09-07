package arr.onedim.p8;

/*
 Дана последовательность целых чисел a1, a2, ... an.
Образовать новую последовательность, выбросив из
исходной те члены, которые равны min (a1, a2, ... an).
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, -5, 50, 40, -5, 15};

        int j = 0;
        int n = 0;
        for (int ar : arr)
            if (ar == isMin(arr)) n++;

        int[] newArr = new int[arr.length - n];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != isMin(arr)) {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println("Исходный массив");
        for (int ar : arr) System.out.print(ar + " ");
        System.out.println();
        System.out.println("Новый массив");
        for (int ar : newArr) System.out.print(ar + " ");
    }


    public static int isMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) min = arr[i];
        }
        return min;
    }

}
