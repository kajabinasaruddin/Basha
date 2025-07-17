package Assignment_Encpsulation_Problems;
public class Book_8 {
    private String title;
    private String author;
    private double price;
    public Book_8(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            double discountAmount = (percentage / 100) * price;
            price -= discountAmount;
        } else {
            System.out.println("Invalid discount percentage. Must be between 0 and 100.");
        }
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " +price);
    }
    public static void main(String[] args) {
        Book_8 book = new Book_8("1984", "George Orwell", 29.99);
        book.displayInfo();
        System.out.println("\nApplying 20% discount...");
        book.applyDiscount(20);
        book.displayInfo();
    }
}
