package d_programmingWithClasses.a_simpleClassesAndObjects.Task3;

public class Main {
    //Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
    //из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
    //номеров групп студентов, имеющих оценки, равные только 9 или 10.

    public static void main(String[] args) {
        Student[] allStudent = new Student[10];
        allStudent[0] = new Student("Петров А.И.", 543, new int[]{7, 8, 7, 8, 10});
        allStudent[1] = new Student("Иванов П.И.", 540, new int[]{7, 8, 7, 8, 10});
        allStudent[2] = new Student("Сидоров А.Д.", 540, new int[]{7, 8, 7, 8, 10});
        allStudent[3] = new Student("Попов А.В.", 543, new int[]{7, 8, 7, 8, 10});
        allStudent[4] = new Student("Петрович А.И.", 544, new int[]{7, 8, 7, 8, 10});
        allStudent[5] = new Student("Анисина И.И.", 548, new int[]{9, 10, 10, 9, 10});
        allStudent[6] = new Student("Дятлов А.И.", 548, new int[]{10, 10, 10, 10, 10});
        allStudent[7] = new Student("Стук Е.К.", 548, new int[]{7, 8, 7, 8, 10});
        allStudent[8] = new Student("Антонов С.И.", 510, new int[]{7, 8, 7, 8, 10});
        allStudent[9] = new Student("Васечкин А.Л.", 510, new int[]{9, 9, 9, 9, 9});

        System.out.println("Отличники:");
        for (Student elem : allStudent) {
            if (isExcellent(elem.getPerformance())) {
                System.out.println("Студент " + elem.getName() + " группа " + elem.getGroup());
            }
        }
    }
    private static boolean isExcellent(int[] perf) {
        boolean flag = true;
        for (int elem : perf) {
            if (elem < 9) {
                flag = false;
            }
        }
        return flag;
    }
}
