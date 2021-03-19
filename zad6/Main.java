
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<Car>();
        Car car1 = new Car("Audi", 2020, 100000);
        Car car2 = new Car("VW", 2020, 21000);
        Car car3 = new Car("Fiat", 2015, 17000);
        Car car4 = new Car("Opel", 2003, 5000);
        Car car5 = new Car("Mercedes", 2019, 30000);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car.toString());

        }

    }
}
