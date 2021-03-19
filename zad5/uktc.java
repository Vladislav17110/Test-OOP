
public class uktc implements student{
    private String name;

    public uktc(String name) {
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.printf("%s is sleeping%n", name);
    }

    @Override
    public void eat() {
        System.out.printf("%s is eating%n", name);
    }

    @Override
    public void walk() {
        System.out.printf("%s is walking%n", name);
    }

    @Override
    public void drink() {
        System.out.printf("%s is drinking%n", name);
    }
}
