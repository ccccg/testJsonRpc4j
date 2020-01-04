package com.example.testjsonrpc.service;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;

@Service
@AutoJsonRpcServiceImpl
public class ExampleServerAPIImpl implements ExampleServerAPI {
    @Override
    public String sayHelloTo(String name) {
        return "hello "+ name;
    }

    @Override
    public int cal(int first, int second) {
        return first + second;
    }
}
