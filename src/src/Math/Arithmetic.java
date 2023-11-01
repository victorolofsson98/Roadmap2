package Math;

public class Arithmetic {
    public static void main(String[] args) {
        Arithmetic calc = new Arithmetic();

        int a = 15;
        int b = 12;

        System.out.println(calc.sum(a, b));
        System.out.println(calc.difference(a, b));
        System.out.println(calc.product(a, b));
        System.out.println(calc.quotient(a, b));
    }

    public Integer sum(int a, int b) {

        return a + b;
    }

    public Integer difference(int a, int b) {
        return b - a;
    }

    public Integer product(int a, int b) {
        return a * b;
    }

    public Integer quotient(int a, int b) {
        return a / b;
    }

}
