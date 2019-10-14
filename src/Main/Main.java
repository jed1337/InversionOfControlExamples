package Main;

import Main.clients.ConstructorInjectionClient;
import Main.clients.NoDependencyInjectionClient;
import Main.clients.SetterInjectionClient;
import Main.services.Service;

public class Main {
    public static void main(String[] args) {
        NoDependencyInjectionClient noDependencyInjectionClient = new NoDependencyInjectionClient();
        noDependencyInjectionClient.getInformation();

        ConstructorInjectionClient constructorInjectionClient = new ConstructorInjectionClient(new Service());
        constructorInjectionClient.getInformation();

        SetterInjectionClient setterInjectionClient = new SetterInjectionClient();
        setterInjectionClient.setService(new Service());
        setterInjectionClient.getInformation();
    }
}
