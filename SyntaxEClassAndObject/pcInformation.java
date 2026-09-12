package SyntaxEClassAndObject;

public class pcInformation {
    private String productName;
    private String vendorName;
    private double productPrice;
    private String storeName;
    private int ramCapacity;
    private int romCapacity;

    public pcInformation(String productName, String vendorName,
                         double productPrice, String storeName,
                         int ramCapacity, int romCapacity) {

        this.productName = productName;
        this.vendorName = vendorName;
        this.productPrice = productPrice;
        this.storeName = storeName;
        this.ramCapacity = ramCapacity;
        this.romCapacity = romCapacity;
    }

    public void displayInfo() {
        System.out.println("\n--- PC INFORMATION ---");
        System.out.println("PC Name: " + productName);
        System.out.println("Vendor Name: " + vendorName);
        System.out.printf("Price: %,.0f VND%n", productPrice);
        System.out.println("Store Name: " + storeName);
        System.out.println("RAM Capacity: " + ramCapacity + " GB");
        System.out.println("ROM Capacity: " + romCapacity + " GB");
    }
}