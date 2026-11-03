package SyntaxC_BuiltinMethods;

public class CharacterMethods {

    public static void main(String[] args) {

        char character = 'A';

        System.out.println(Character.isLetter(character));

        System.out.println(Character.isDigit(character));

        System.out.println(Character.isUpperCase(character));

        System.out.println(Character.isLowerCase(character));

        System.out.println(Character.toLowerCase(character));

        System.out.println(Character.toUpperCase('b'));

    }
}
