package com.example.testjsonrpccli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    @Autowired
    ExampleClientAPI exampleClientAPI;

    public void sayHello(String name){
        System.out.println(exampleClientAPI.sayHelloTo(name));
    }

    public void cal(int a, int b){
        System.out.println(exampleClientAPI.cal(a,b));
    }
}
