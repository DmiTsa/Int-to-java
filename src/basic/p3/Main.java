package basic.p3;

/*
 Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 (sin x +cos y)/(cos x - sin y) * tg xy
 */
public class Main {
    public static void main(String[] args) {
        double x = 30, y = 60;
        double res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("Результат " + res);
    }
}
