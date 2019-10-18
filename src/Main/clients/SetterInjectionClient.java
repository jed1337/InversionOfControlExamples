package Main.clients;

import Main.cars.Car;

import java.security.InvalidParameterException;

//The client method provides a setter method for the dependency
public class SetterInjectionClient {
    private Car car;

    public void setCar(Car car) {
//        Advantage: freedom and flexibility to manipulate the state
        this.car = car;
    }

    public void getInformation(){
//        Disadvantage. It is hard to ensure that all dependencies are provided before the client is used
        if (car == null) {
            throw new InvalidParameterException("Service is null");
        }
        System.out.println("Setter injection client");
        System.out.println(car.getInformation());
    }
}
