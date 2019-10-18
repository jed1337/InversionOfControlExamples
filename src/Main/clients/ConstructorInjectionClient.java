package Main.clients;

import Main.cars.Car;

//Preferred when all dependencies can be constructed first
//Ensures that the client is in a valid state(all the dependencies are present)
public class ConstructorInjectionClient {
    private final Car car;

//    Control shifts from the ConstructorInjectionClient to the classes that call it
//    Main is our IoC container
    public ConstructorInjectionClient(Car car) {
//        Advantage: Guarantees that the client is in a valid state
//        We can set what type of service we want
//        Disadvantage: we are unable to change the state later
        this.car = car;
    }

    public void getInformation(){
        System.out.println("Constructor injection client");
        System.out.println(car.getInformation());
    }
}
