package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> carList = new ArrayList<>(Arrays.asList(
            new Car("Vol", "V", 12),
            new Car("Wol", "X", 7),
            new Car("Rang", "C", 9),
            new Car("Toy", "C", 32),
            new Car("Kia", "A", 3)
    ));

    @Override
    public List<Car> getCarsFromList(int amount) {
        return amount >= 5? carList : carList.subList(0, amount);
    }
}