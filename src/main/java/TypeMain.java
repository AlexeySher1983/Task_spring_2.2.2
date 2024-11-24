import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class TypeMain {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "blue", 200);
        Car car2 = new Car("Mercedes", "white", 220);
        Car car3 = new Car("Audi", "red", 210);
        Car car4 = new Car("Nissan", "black", 230);
        Car car5 = new Car("Toyota", "green", 240);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        // Вывод информации о каждом автомобиле
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}