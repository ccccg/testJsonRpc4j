package com.example.testjsonrpccli.service;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import org.springframework.stereotype.Service;

@Service
public interface ExampleClientAPI {
    String sayHelloTo(@JsonRpcParam(value = "name") String name);

    int cal(@JsonRpcParam(value = "b") int a, @JsonRpcParam(value = "a") int b);
}
