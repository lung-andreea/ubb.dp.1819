package lab2.Bridge.abstraction;

import lab2.Bridge.model.Car;
import lab2.Bridge.service.CarCreationService;

import java.util.Arrays;
import java.util.List;

public class CarParkExpensive extends CarPark {

    public CarParkExpensive(CarCreationService service) {
        super(service);
    }

    @Override
    public void buyCar() {
        List<String> carParts = Arrays.asList("summer","titanium","electric","blue");
        Car car = this.service.createCar(carParts);
        System.out.println("Bought an expensive car: "+car.toString());
    }
}
