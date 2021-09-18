package a_basicsOfSoftwareCodeDevelopment.a_linearProgramms;

public class Task6 {
    /*
    Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
   принадлежит закрашенной области, и false — в противном случае:
    */
    private boolean a;
    int x = 0, y = 1;
    public static void main(String[] args) {
        boolean a;
        int x = 0, y = 1;
        a = ((x <= 2 && x >= -2) && (y <= 4 && y >= 0)) || ((x <= 4 && x >= -4) & (y <= 0 && y >= -3));
        System.out.println(a);
    }
}
