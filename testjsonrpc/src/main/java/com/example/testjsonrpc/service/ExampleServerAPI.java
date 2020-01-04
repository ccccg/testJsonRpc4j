package com.example.testjsonrpc.service;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;


@JsonRpcService("/sayhello")
public interface ExampleServerAPI {
    String sayHelloTo(@JsonRpcParam(value = "name") String name);

    int cal(@JsonRpcParam(value = "a") int first, @JsonRpcParam(value = "b") int second);
}
