package com.example.testjsonrpccli.configuration;

import com.example.testjsonrpccli.service.ExampleClientAPI;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.googlecode.jsonrpc4j.ProxyUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class JsonRpcCliConfig {

    private static final String endpoint = "http://47.94.129.13:8080/sayhello";

    @Bean
    public JsonRpcHttpClient jsonRpcHttpClient(){
        URL url = null;
        Map<String, String> map = new HashMap<>();
        try {
            url = new URL(JsonRpcCliConfig.endpoint);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new JsonRpcHttpClient(url, map);
    }

    @Bean
    public ExampleClientAPI exampleClientAPI(JsonRpcHttpClient jsonRpcHttpClient) {
        return ProxyUtil.createClientProxy(getClass().getClassLoader(), ExampleClientAPI.class, jsonRpcHttpClient);
    }
}
