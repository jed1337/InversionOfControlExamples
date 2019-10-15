package Main.clients;

import Main.services.BasicService;
import Main.services.Service;

public class NoDependencyInjectionClient {
    private final Service service;

    public NoDependencyInjectionClient() {
//        Disadvantage: We are locked or coupled to this specific implementation of service
        this.service = new BasicService();
    }

    public void getInformation(){
        System.out.println("No dependency injection client");
        System.out.println(service.getInformation());
    }
}
