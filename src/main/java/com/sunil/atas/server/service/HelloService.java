package com.sunil.atas.server.service;

import com.sunil.atas.server.model.Hello;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public Hello hello() {
        Hello hello = new Hello();
        hello.setValue("Hello from SSL Server !!!");
        return hello;
    }
}
