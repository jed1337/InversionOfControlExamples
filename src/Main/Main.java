package Main;

import Main.clients.ConstructorInjectionClient;
import Main.clients.NoInversionOfControl;
import Main.clients.SetterInjectionClient;
import Main.cars.BasicCar;

public class Main {
    public static void main(String[] args) {
        NoInversionOfControl noInversionOfControl = new NoInversionOfControl();
        noInversionOfControl.getInformation();

        //
        ConstructorInjectionClient constructorInjectionClient = new ConstructorInjectionClient(new BasicCar());
        constructorInjectionClient.getInformation();

        SetterInjectionClient setterInjectionClient = new SetterInjectionClient();
        setterInjectionClient.setCar(new BasicCar());
        setterInjectionClient.getInformation();
    }
}
