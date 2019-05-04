package com.iot.serverinterface.api;

import com.iot.serverinterface.dto.RequestSumDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("server")
public interface WebApi {

    @RequestMapping(value = "/sum" , method = RequestMethod.POST)
    String sum(@RequestBody RequestSumDTO dto);
}
