package web.service;

import web.Model.Car;
import web.dao.CarDao;
import web.dao.CarDaoImpl;

import java.util.List;

public class CarServiceImpl implements CarSevice {

    CarDao car = new CarDaoImpl();

    public List<Car> createListOfCars() {
        return car.createListOfCars();
    }

    public List<Car> getSomeCars(List<Car> carList, int numberOfCars) {
        return car.getSomeCars(carList, numberOfCars);
    }

}
