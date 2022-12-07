package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;
import web.service.CarSevice;


@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        CarSevice car = new CarServiceImpl();
        model.addAttribute("car", car.getSomeCars(car.createListOfCars(), count));
        return "car";
    }
}
