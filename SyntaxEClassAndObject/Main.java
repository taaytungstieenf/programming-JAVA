package SyntaxEClassAndObject;

public class Main {
    public static void main(String[] args) {

        pcInformation pc1 = new pcInformation(
                "Alienware 16 Aurora",
                "Dell",
                35000000,
                "Dell Store",
                32,
                1000
        );

        pc1.displayInfo();
    }
}