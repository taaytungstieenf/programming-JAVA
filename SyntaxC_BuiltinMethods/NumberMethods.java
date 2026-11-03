package SyntaxC_BuiltinMethods;

public class NumberMethods {

    public static void main(String[] args) {

        String age = "26";
        String salary = "15000000.5";

        int convertedAge = Integer.parseInt(age);

        double convertedSalary = Double.parseDouble(salary);

        System.out.println(convertedAge + 1);

        System.out.println(convertedSalary + 500000);

        String result = String.valueOf(convertedAge);

        System.out.println(result + " years old");

    }
}