
public class lap extends Computer {
    private double inches;

    public lap(String brand, String model, double price, double inches) {
    public lap(double inches) {
            this.inches = inches;
        }


    @Override
    public void printInfo() {
        System.out.printf("Brand: %s, Model: %s, Price: %.2f, Inches: %.2f%n", brand, model, price, inches);
    }
}

