package d_programmingWithClasses.a_simpleClassesAndObjects.Task5;

public class Counter {

    private final int MIN_VALUE = 1;
    private final int MAX_VALUE = 100;
    private int currentValue;

    public Counter(int currentValue) {
        if (currentValue >= MIN_VALUE && currentValue <= MAX_VALUE) {
            this.currentValue = currentValue;
        } else {
            System.out.println("Допустимый диапазон " + MIN_VALUE + " - " + MAX_VALUE +
                    ". Установлено значение " + MIN_VALUE);
        }
    }

    public Counter() {
        this.currentValue = MIN_VALUE;
    }

    public int getCurrentValue() {
        System.out.print("Текущее значение = ");
        return currentValue;
    }

    public void increasePerOne() {
        if (currentValue < MAX_VALUE) {
            currentValue++;
        } else {
            System.out.println("Достигнуто максимальное значение - " + MAX_VALUE);
        }
    }

    public void decreasePerOne() {
        if (currentValue > MIN_VALUE) {
            currentValue--;
        } else {
            System.out.println("Достигнуто минимальное значение - " + MIN_VALUE);

        }
    }
}
