package Main;

import Main.clients.ConstructorInjectionClient;
import Main.clients.NoInversionOfControl;
import Main.clients.SetterInjectionClient;
import Main.services.BasicService;

public class Main {
    public static void main(String[] args) {
        NoInversionOfControl noInversionOfControl = new NoInversionOfControl();
        noInversionOfControl.getInformation();

        //
        ConstructorInjectionClient constructorInjectionClient = new ConstructorInjectionClient(new BasicService());
        constructorInjectionClient.getInformation();

        SetterInjectionClient setterInjectionClient = new SetterInjectionClient();
        setterInjectionClient.setService(new BasicService());
        setterInjectionClient.getInformation();
    }
}
