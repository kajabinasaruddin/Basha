package Assignment_Encpsulation_Problems;
public class House_11 {
    private String address;
    private int numberOfRooms;
    private double area; // in square meters
    public House_11(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;}
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double calculatePrice(double pricePerSquareMeter) {
        return area * pricePerSquareMeter;
    }
    public void displayInfo() {
        System.out.println("Address: " + address);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Area: " + area + " sq.m");}
    public static void main(String[] args) {
        House_11 house = new House_11("123 Maple Street", 4, 150.5);
        house.displayInfo(); }
}
