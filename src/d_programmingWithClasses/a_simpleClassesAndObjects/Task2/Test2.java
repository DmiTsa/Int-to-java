package d_programmingWithClasses.a_simpleClassesAndObjects.Task2;

public class Test2 {
    private int var1;
    private int var2;

    public Test2(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public Test2() {
        System.out.println("Установлены значения по умолчанию");
        this.var1 = 100;
        this.var2 = 200;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }
}
