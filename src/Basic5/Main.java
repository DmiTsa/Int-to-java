package Basic5;
/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */
public class Main {
    public static void main(String[] args) {
    int T=24754;
    int h, m, s;
    h=T/3600; m=(T-h*3600)/60; s=T-h*3600-m*60;
    String sh = "0" + h, sm = "0" + m, ss = "0" + s;
        System.out.print(sh.substring(sh.length()-2) + "ч ");
        System.out.print(sm.substring(sm.length()-2) + "мин ");
        System.out.print(ss.substring(ss.length()-2) + "c.");
    }
}
