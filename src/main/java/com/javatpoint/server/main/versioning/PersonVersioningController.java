package com.javatpoint.server.main.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
    @GetMapping(value="/person/param", params="X-API-Version=1")
    public PersonV1 personV1(){
        return new PersonV1("Mamuka Bigvava");
    }


    @GetMapping(value="/person/param", params="X-API-Version=2")
    public PersonV2 personV2(){
        return new PersonV2(new Name("Giorgi", "Bigvava"));
    }
}
