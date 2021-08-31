package Basic2;
/*
Вычислить значение выражения по формуле
все переменные действительные числа
 */
public class Main {
  public static void main(String[] args) {
    double a=4, b=5, c=6;
    double res;
    res = (b + Math.sqrt(Math.pow(b, 2)+ 4*a*c))/2*a - Math.pow(a, 3)*c + Math.pow(b, -2);
    System.out.print(res);
  }
}
