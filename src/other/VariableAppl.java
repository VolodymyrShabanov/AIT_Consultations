package other;

public class VariableAppl {
    public static void main(String[] args) {
        int a;
        a = 10;
        System.out.println(a);
//        a = 10;
//            System.out.println(a);

        double b;
        b = 12.3;
        System.out.println(b);

        double c;
        c = 6;
        System.out.println(c);

        System.out.println(multiplication(a,b));


    }

    public static double multiplication(double number1, double number2) {
        double result;
        result = number1 * number2;
        return result;

        //System.out.println(result);

    }
}
