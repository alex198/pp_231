package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;


public class CarServiceImp implements CarService {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "Blue", 2015));
        cars.add(new Car("HONDA", "Black", 2016));
        cars.add(new Car("AUDI", "White", 2017));
        cars.add(new Car("NISSAN", "Red", 2018));
        cars.add(new Car("TESLA", "Green", 2019));
    }

    @Override
    public List<Car> printCars(Integer count) {
        if(count != null) {
            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }
}
