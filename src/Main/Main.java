package Main;

import Main.cars.GrabCar;
import Main.clients.ConstructorInjectionClient;
import Main.clients.NoInversionOfControl;
import Main.clients.SetterInjectionClient;
import Main.cars.MyCar;

public class Main {
    public static void main(String[] args) {
        NoInversionOfControl noInversionOfControl = new NoInversionOfControl();
        noInversionOfControl.getInformation();
        System.out.println();

        ConstructorInjectionClient constructorInjectionClient = new ConstructorInjectionClient(new GrabCar());
        constructorInjectionClient.getInformation();
        System.out.println();

        SetterInjectionClient setterInjectionClient = new SetterInjectionClient();
        setterInjectionClient.setCar(new MyCar());
        setterInjectionClient.getInformation();
        System.out.println();
    }
}
