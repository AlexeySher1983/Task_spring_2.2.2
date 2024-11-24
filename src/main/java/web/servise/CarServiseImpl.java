package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarServiseImpl implements CarServise {
   private  List<Car> cars = List.of(

           new Car("Audi", "Black", 200),
           new Car("BMW", "White", 250),
           new Car("Toyota", "Red", 180),
           new Car("Nissan", "Blue", 220),
           new Car("Volkswagen", "Green", 210)
   );

    @Override
    public List<Car> getCars(int count) {
    return cars.stream()
            .limit(Math.min(count, cars.size()))
            .collect(Collectors.toList());

//
//        if( count >= cars.size()) {
//            return cars;
//        } else {
//            return cars.subList(0, count);
//        }
    }

    @Override
    public List<Car> showCars() {
        return cars;

    }

}
