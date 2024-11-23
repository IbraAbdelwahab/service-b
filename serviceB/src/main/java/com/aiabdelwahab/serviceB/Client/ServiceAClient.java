package com.aiabdelwahab.serviceB.Client;

import com.aiabdelwahab.serviceB.Models.ServiceAResponse;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serviceA", url = "http://localhost:8081")
public interface ServiceAClient {

    @GetMapping("/serviceA/data")
    ResponseEntity<ServiceAResponse> getDataFromServiceA();
}

