package Main.clients;

import Main.services.BasicService;
import Main.services.Service;

import java.security.InvalidParameterException;

//The client method provides a setter method for the dependency
public class SetterInjectionClient {
    private Service service;

    public void setService(BasicService service) {
//        Advantage: freedom and flexibility to manipulate the state
        this.service = service;
    }

    public void getInformation(){
//        Disadvantage. It is hard to ensure that all dependencies are provided before the client is used
        if (service == null) {
            throw new InvalidParameterException("Service is null");
        }
        System.out.println("Setter injection client");
        System.out.println(service.getInformation());
    }
}
