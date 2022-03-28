package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "cars")
    public String printCars(@RequestParam(value = "count",required = false) Integer count, ModelMap map){

        List <Car> carsToShow = carService.getCars(count);
        map.addAttribute("cars",carsToShow);

        return "cars";


    }
}
