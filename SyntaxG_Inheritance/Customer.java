package SyntaxG_Inheritance;

public class Customer extends User {    // Lớp con Customer kế thừa từ lớp cha User

    private String customerId;          // Thuộc tính riêng của lớp con Customer
    private String membershipType;      // Thuộc tính riêng của lớp con Customer

    public Customer(String username, 
                    String password, 
                    String fullname, 
                    int birthyear,
                    String nationality,
                    String membershipType,
                    String customerId) {

        super(username, password, fullname, birthyear, nationality); // Gọi constructor của lớp cha User

        this.membershipType = membershipType;
        this.customerId = customerId;
    }

    @Override // Ghi đè phương thức displayInfo() từ lớp cha User, giúp trình biên dịch kiểm tra rằng bạn thực sự đang ghi đè một phương thức được kế thừa
    public void displayInfo() {

        System.out.println("! Account Type: Customer");
        System.out.println("! Customer ID: " + customerId);
        System.out.println("! Membership: " + membershipType);

        super.displayInfo();
    }
}
