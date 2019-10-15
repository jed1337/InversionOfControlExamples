package Main.clients;

import Main.services.BasicService;
import Main.services.Service;

public class NoDependencyInjectionClient {
    private final Service service;

    public NoDependencyInjectionClient() {
//        We are locked to this specific implementation of service
        this.service = new BasicService();
    }

    public void getInformation(){
        System.out.println("No dependency injection client");
        System.out.println(service.getInformation());
    }
}
