package Main.clients;

import Main.services.Service;

import java.security.InvalidParameterException;

public class SetterInjectionClient {
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void getInformation(){
        if (service == null) {
            throw new InvalidParameterException("Service is null");
        }
        System.out.println("Setter injection client");
        System.out.println(service.toString());
    }
}
