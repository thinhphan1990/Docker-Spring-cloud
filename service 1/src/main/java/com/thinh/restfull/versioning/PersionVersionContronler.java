package com.thinh.restfull.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersionVersionContronler {
    @GetMapping("/V1/persion")
    public personV1 PersonV1 (){

        return new personV1("thinhptp");
    }



}
