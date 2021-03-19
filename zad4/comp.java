
public class comp extends Computer{
    private String color;

    public comp(String color) {
        this.color = color;
    }

    public PC(String brand, String model, double price, String color) {

    }

    @Override
    public void printInfo() {
        System.out.printf("Brand: %s, Model: %s, Price: %.2f, Color: %s%n", brand, model, price, color);
    }
}
