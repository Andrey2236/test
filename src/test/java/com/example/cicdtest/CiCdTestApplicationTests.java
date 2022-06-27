package com.example.cicdtest;

import com.example.cicdtest.controller.MainController;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiCdTestApplicationTests {

    @Autowired
    MainController mainController;

    @Test
    void contextLoads() {
    }

    @Test
    void testController() {
        String actual = mainController.HelloWorld();
        assert actual.equals("hello world");
    }

//
}
