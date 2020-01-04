package com.example.testjsonrpccli.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class ExampleServiceTest {

    @Autowired
    ExampleService exampleService;

    @Test
    public void test(){
        exampleService.sayHello("cg");
    }

    @Test
    public void testcal(){
        exampleService.cal(3,5);
    }


}