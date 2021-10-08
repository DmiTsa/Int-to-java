package d_programmingWithClasses.a_simpleClassesAndObjects.Task1;

public class Main {
    //Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
    //переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
    //наибольшее значение из этих двух переменных.
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.setVar1(44);
        test.setVar2(20);

        test.printVariables();
        System.out.println("Сумма переменных = "+ test.sumVariables());
        System.out.println("Наибольшая из переменых = "+ test.biggerVariables());
    }
}
