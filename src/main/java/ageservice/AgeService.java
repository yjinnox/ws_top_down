package ageservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "getAge")
public class AgeService implements generated.ageservice.AgeService {

    @WebMethod
    public String getAge(Integer arg0) {
        return "Votre âge est de " +(2017-arg0) + "ans";
    }
}
