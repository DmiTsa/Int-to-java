package module2.lineararray;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class Task10 {
   
    public static void main(String[] args) {
    	 int[] array;
    	 
    	 {
    		 array = new int[]{5, 6, 8, 7, 2, 14, 12, -5, 1, -2};
    	 }
    	
    	 System.out.println("Начальный массив");
    	 outputIntegerConsole(array);
    	 
         for (int i = 1; i < array.length; i += 2) {
             array[i] = 0;
         }
    	 
    	 System.out.println("Сжатый массив");
    	 outputIntegerConsole(array);

    }
    private static void outputIntegerConsole(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
    
}