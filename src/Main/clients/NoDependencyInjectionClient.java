package Main.clients;

import Main.services.Service;

public class NoDependencyInjectionClient {
    private final Service service;

    public NoDependencyInjectionClient() {
        this.service = new Service();
    }

    public void getInformation(){
        System.out.println("No dependency injection client");
        System.out.println(service.toString());
    }
}
