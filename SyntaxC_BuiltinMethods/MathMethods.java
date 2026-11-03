package SyntaxC_BuiltinMethods;

public class MathMethods {

    public static void main(String[] args) {

        int a = -15;
        int b = 20;

        System.out.println(Math.max(a, b));

        System.out.println(Math.min(a, b));

        System.out.println(Math.abs(a));

        System.out.println(Math.sqrt(64));

        System.out.println(Math.pow(2, 3));

        System.out.println(Math.round(5.6));

        System.out.println(Math.ceil(5.2));

        System.out.println(Math.floor(5.8));

        double randomNumber = Math.random();

        System.out.println(randomNumber);

    }
}
