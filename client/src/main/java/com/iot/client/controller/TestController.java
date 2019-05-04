package com.iot.client.controller;

import com.iot.serverinterface.api.WebApi;
import com.iot.serverinterface.dto.RequestSumDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;


    @Autowired
    WebApi webApi;


    @GetMapping("/test")
    public Object test(){
        return discoveryClient.getInstances("server");
    }

    @GetMapping("/test2")
    public String test2(){
        RequestSumDTO dto = new RequestSumDTO();
        dto.setArg1(1);
        dto.setArg2(2);
        return webApi.sum(dto);
    }
}
