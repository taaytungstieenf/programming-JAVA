package SyntaxC_BuiltinMethods;

public class StringMethods {

    public static void main(String[] args) {

        String username = "  Nguyen Van A  ";

        System.out.println(username.length());

        System.out.println(username.trim());

        System.out.println(username.toUpperCase());

        System.out.println(username.toLowerCase());

        System.out.println(username.contains("Van"));

        System.out.println(username.startsWith("Nguyen"));

        System.out.println(username.replace("A", "B"));

        System.out.println(username.substring(2, 8));

    }
}
