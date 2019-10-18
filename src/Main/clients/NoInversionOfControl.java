package Main.clients;

import Main.cars.BasicCar;

//No inversion of control since this class controls what kind of service it uses
public class NoInversionOfControl {
    private final BasicCar car;

    public NoInversionOfControl() {
//        Disadvantage: We are locked or coupled to this specific implementation of service
        this.car = new BasicCar();
    }

    public void getInformation(){
        System.out.println("No inversion of control client");
        System.out.println(car.getInformation());
    }
}
