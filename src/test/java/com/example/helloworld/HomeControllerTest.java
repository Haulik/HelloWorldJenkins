package com.example.helloworld;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest {

    private HomeController homeController = new HomeController();

    @Test
    public  void home() {
        assertEquals("index", homeController.home());
    }
}
