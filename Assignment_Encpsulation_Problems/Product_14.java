package Assignment_Encpsulation_Problems;
public class Product_14 {
    private String productName;
    private String productCode;
    private double price;
    public Product_14(String productName, String productCode, double price) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = (percentage / 100) * price;
            price -= discountAmount;
            System.out.println("Discount applied: " + percentage + "%");
        } else {
            System.out.println("Invalid discount percentage. It must be between 0 and 100.");
        }
    }
    public void displayProductInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Code: " + productCode);
        System.out.println("Price: $" + String.format("%.2f", price));
    }
    public static void main(String[] args) {
        Product_14 product = new Product_14("Laptop", "LAP123", 1200.00);
        product.displayProductInfo();
        System.out.println("\nApplying 10% discount...");
        product.applyDiscount(10);
        product.displayProductInfo();
    }
}
