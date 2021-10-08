package d_programmingWithClasses.a_simpleClassesAndObjects.Task3;

public class Student {
    private String name;
    private int group;
    private int[] performance = new int[5];

    public Student(String name, int group, int[] performance) {
        this.name = name;
        this.group = group;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int[] getPerformance() {
        return performance;
    }
}
