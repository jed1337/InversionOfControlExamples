package Main.clients;

import Main.services.Service;

//Preferred when all dependencies can be constructed first
//Ensures that the client is in a valid state(all the dependencies are present)
public class ConstructorInjectionClient {
    private final Service service;

    public ConstructorInjectionClient(Service service) {
//        Advantage: Guarantees that the client is in a valid state
//        We can set what type of service we want
//        Disadvantage: we are unable to change the state later
        this.service = service;
    }

    public void getInformation(){
        System.out.println("Constructor injection client");
        System.out.println(service.getInformation());
    }
}
