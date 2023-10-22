package org.carrental;

import org.carrental.model.Car;
import org.carrental.model.CarClass;
import org.carrental.model.CarStatus;
import org.carrental.repository.CarRepository;
import org.carrental.service.CarService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CarRepository carRepository = new CarRepository();
        CarService carService = new CarService(carRepository);

        Car car = new Car(null, "volkswagen", "golf", "123",
                CarClass.STANDARD, CarStatus.AVAILABLE);

        Car createdCar = carService.createCar(car);

        System.out.println(createdCar);

        Car carById = carService.getById(0);

        System.out.println(carById);

        Car invalidCar = new Car(null, "volkswagen",
                "golf", "1234",
                CarClass.STANDARD, CarStatus.AVAILABLE);

        carService.createCar(invalidCar);


    }
}