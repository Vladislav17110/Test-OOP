
abstract public class comp {

    protected String brand;
    protected String model;
    protected double price;

    public comp(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Computer(String brand, String model, double price) {


    }


    public void printInfo() {
        System.out.printf("Brand: %s, Model: %s, Price: %.2f%n", brand, model, price);
    }
}
