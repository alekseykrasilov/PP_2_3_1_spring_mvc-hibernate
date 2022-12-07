package web.service;

import web.Model.Car;

import java.util.List;

public interface CarSevice {

    List<Car> createListOfCars();

    List<Car> getSomeCars(List<Car> carList, int numberOfCars);
}
