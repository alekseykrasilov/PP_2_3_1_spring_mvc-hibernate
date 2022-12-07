package web.dao;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    public List<Car> createListOfCars() {
        List<Car> listOfCars = new ArrayList<>();
        Car car1 = new Car("BMW", 721, 01);
        Car car2 = new Car("Audi", 213, 02);
        Car car3 = new Car("Mercedes", 123, 18);
        Car car4 = new Car("Volvo", 555, 12);
        Car car5 = new Car("Toyota", 770, 13);

        listOfCars.add(car1);
        listOfCars.add(car2);
        listOfCars.add(car3);
        listOfCars.add(car4);
        listOfCars.add(car5);

        return listOfCars;
    }

    public List<Car> getSomeCars(List<Car> carList, int numberOfCars) {
        if (numberOfCars > 5 || numberOfCars == 0) {
            return carList;
        } else {
            return carList.stream().limit(numberOfCars).toList();
        }
    }
}
