package b_algoritmization.decompos;

public class Task7 {
    /*
    Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9
     */
    public static void main(String[] args) {
        for (int i=1; i<10;i++){
            if (i % 2 != 0){
                System.out.println("Факториал "+ i +" равен "+ factorial(i));
            }
        }
    }
    private static int factorial (int f){
        int factorial=1;
        for (int i=1; i<=f;i++){
            factorial *=i;
        }
        return factorial;
    }
}
