package com.sunil.atas.server.controller;

import com.sunil.atas.server.model.Hello;
import com.sunil.atas.server.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class HelloServerController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello-server")
    public Hello hello() {
        return helloService.hello();
    }
}
