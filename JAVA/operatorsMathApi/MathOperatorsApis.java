package JAVA.operatorsMathApi;

public class MathOperatorsApis {

    public static void main(String[] args) {

        double a = 12;
        double b = 13;
        double c = 15;

        double s = (a + b + c) / 2;
        double area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        
        System.out.println(area);
    }

}
