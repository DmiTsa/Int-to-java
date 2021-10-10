package d_programmingWithClasses.a_simpleClassesAndObjects.Task6;

public class TestTimeMark {
    //Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.
    public static void main(String[] args) {
        TimeMark time1 = new TimeMark(10, 50, 20);

        System.out.println(time1.getTime());

        time1.setOf(15,'h');
        time1.setOf(10,'m');
        time1.setOf(33,'s');

        time1.changeHours(-25);
        time1.changeMinutes(20);
        time1.changeSeconds(601);


        System.out.println(time1.getTime());
    }

}
