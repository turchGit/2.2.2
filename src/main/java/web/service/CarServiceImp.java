package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService{
    private static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car(50,1000,"First"));
        carList.add(new Car(60,2000,"Second"));
        carList.add(new Car(70,1500,"Third"));
        carList.add(new Car(80,3000,"Fourth"));
        carList.add(new Car(90,1900,"Fifth"));
    }
    @Override
    public List<Car> getCars(Integer i) {


        if (i==null||i>=carList.size()){
            return carList;
        }
        return  carList.stream().limit(i).collect(Collectors.toList());


    }
}
