package com.docker.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DockerController {

    @GetMapping("/spdoc")
    public String getFirstDocker(){
        return "Hello Docker ";
    }
}
