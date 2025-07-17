package Assignment_Encpsulation_Problems;
public class SmartPhone_9 {
    private String brand;
    private String model;
    private int storageCapacity;
    public SmartPhone_9(String brand, String model, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public void increaseStorage(int additionalStorage) {
        if (additionalStorage > 0) {
            storageCapacity += additionalStorage;
        } else {
            System.out.println("Invalid storage amount. Must be greater than 0.");
        }
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }
    public static void main(String[] args) {
        SmartPhone_9 phone = new SmartPhone_9("Samsung", "Galaxy S21", 128);
        phone.displayInfo();
        System.out.println("\nIncreasing storage by 64GB...");
        phone.increaseStorage(64);
        phone.displayInfo();
    }
}
