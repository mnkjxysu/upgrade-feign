package com.iot.consul.web;

import com.iot.serverinterface.api.WebApi;
import com.iot.serverinterface.dto.RequestSumDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements WebApi {

    @RequestMapping("/hello")
    public String hello() {
        return "helle consul";
    }


    @Override
    public String sum(RequestSumDTO dto) {
        return String.valueOf(dto.getArg1() + dto.getArg2());
    }
}
