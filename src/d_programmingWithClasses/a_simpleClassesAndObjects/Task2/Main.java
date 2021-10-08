package d_programmingWithClasses.a_simpleClassesAndObjects.Task2;

public class Main {
    //Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
    //конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
    //класса.
    public static void main(String[] args) {
        Test2 test = new Test2();
        System.out.println("Переменные равны " + test.getVar1() + " " + test.getVar2());

        Test2 testInit = new Test2(50, 60);
        System.out.println("Переменные равны " + testInit.getVar1() + " " + testInit.getVar2());
    }
}
