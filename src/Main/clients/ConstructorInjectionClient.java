package Main.clients;

import Main.services.Service;

public class ConstructorInjectionClient {
    private final Service service;

    public ConstructorInjectionClient(Service service) {
        this.service = service;
    }

    public void getInformation(){
        System.out.println("Constructor injection client");
        System.out.println(service.toString());
    }
}
