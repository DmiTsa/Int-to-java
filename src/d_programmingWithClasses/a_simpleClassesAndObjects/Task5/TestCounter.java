package d_programmingWithClasses.a_simpleClassesAndObjects.Task5;

public class TestCounter {
    //Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
    //на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
    //произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
    //позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
    //Написать код, демонстрирующий все возможности класса.

    public static void main(String[] args) {
        //допустимые значения счетчика 1 - 100 выставлены в классе
        Counter counter1 = new Counter(1);
        Counter counter2 = new Counter(97);

        counter1.increasePerOne();
        counter2.increasePerOne();

        System.out.println(counter1.getCurrentValue());
        System.out.println(counter2.getCurrentValue());

        counter1.decreasePerOne();
        counter2.decreasePerOne();

        System.out.println(counter1.getCurrentValue());
        System.out.println(counter2.getCurrentValue());

        for (int i = 0; i < 101; i++) {
            counter1.increasePerOne();
        }
        System.out.println(counter1.getCurrentValue());
    }
}
