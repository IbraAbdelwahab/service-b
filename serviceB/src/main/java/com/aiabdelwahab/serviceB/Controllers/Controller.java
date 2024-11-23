package com.aiabdelwahab.serviceB.Controllers;

import com.aiabdelwahab.serviceB.Client.ServiceAClient;
import com.aiabdelwahab.serviceB.Models.ServiceAResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final ServiceAClient serviceAClient;


    public Controller(ServiceAClient serviceAClient) {
        this.serviceAClient = serviceAClient;
    }

    @GetMapping("/serviceB/process")
    public String processDate(){
        ServiceAResponse resp = serviceAClient.getDataFromServiceA().getBody();

        return "Date returned from Service A: number = "+resp.getNumber() + " and message = " + resp.getMessage() ;
    }
}
