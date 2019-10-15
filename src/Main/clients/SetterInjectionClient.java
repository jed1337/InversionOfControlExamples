package Main.clients;

import Main.services.BasicService;
import Main.services.Service;

import java.security.InvalidParameterException;

public class SetterInjectionClient {
    private Service service;

    public void setService(BasicService service) {
//        We have the option of changing services multiple times
        this.service = service;
    }

    public void getInformation(){
//        It can happen that service is null since it has not been set before
        if (service == null) {
            throw new InvalidParameterException("Service is null");
        }
        System.out.println("Setter injection client");
        System.out.println(service.getInformation());
    }
}
