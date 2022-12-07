package web.dao;

import web.Model.Car;
import java.util.List;

public interface CarDao {
    List<Car> createListOfCars();
    List<Car> getSomeCars(List<Car> carList, int numberOfCars);
}
