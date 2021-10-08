package d_programmingWithClasses.a_simpleClassesAndObjects.Task1;

public class Test1 {
    private int var1;
    private int var2;

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public void printVariables() {
        System.out.println("Printing " + var1 + " " + var2);
    }

    public int sumVariables() {
        return var1 + var2;
    }

    public int biggerVariables (){
        return Math.max(var1, var2);
    }
}
