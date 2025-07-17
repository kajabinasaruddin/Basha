package Assignment_Encpsulation_Problems;
public class Desktop_10 {
    private String brand;
    private String processor;
    private int ramSize; // in GB
    public Desktop_10(String brand, String processor, int ramSize) {
        this.brand = brand;
        this.processor = processor;
        this.ramSize = ramSize;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public int getRamSize() {
        return ramSize;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    // Method to upgrade RAM
    public void upgradeRam(int additionalRam) {
        if (additionalRam > 0) {
            ramSize += additionalRam;
        } else {
            System.out.println("Invalid RAM upgrade amount. It must be positive.");
        }
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + "GB");
    }
    public static void main(String[] args) {
        Desktop_10 desktop = new Desktop_10("Dell", "Intel Core i7", 8);
        desktop.displayInfo();

        System.out.println("\nUpgrading RAM by 8GB...");
        desktop.upgradeRam(8);
        desktop.displayInfo();
    }
}

