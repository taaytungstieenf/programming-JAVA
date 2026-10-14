package SyntaxI_Interface;

public class Customer extends User {

    private String customerId;
    private String membershipType;

    public Customer(String username,
                    String password,
                    String fullname,
                    int birthyear,
                    String nationality,
                    String membershipType,
                    String customerId) {

        super(username, password, fullname,
              birthyear, nationality);

        this.membershipType = membershipType;
        this.customerId = customerId;
    }

    @Override
    public void displayAccountDetails() {

        System.out.println("Account Type: Customer");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Membership: " + membershipType);
    }
}
