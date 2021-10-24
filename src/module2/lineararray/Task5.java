package module2.lineararray;
//Даны целые числа а1, а2, ... ,аn. Вывести на печать только те числа, для которых аi > i

public class Task5 {
	public static void main(String[] args) {
        int[] array;
        
        {
        	array = new int[]{4, 0, 66, -4, -15, 20};
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
        
    }
}