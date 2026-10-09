package SyntaxE_ClassAndObject;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(
                "taetaetae333",
                "Ritchie2Guns",
                "Nguyen Duc Tay",
                1999,
                "Vietnamese"
        );

        user1.displayInfo();

        System.out.println("Age: " + user1.calculateAge(2026));

        user1.updateNationality("Canadian");

        user1.displayInfo();
    }
}