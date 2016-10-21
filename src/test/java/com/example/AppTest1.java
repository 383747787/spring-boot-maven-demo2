package com.example;

import com.example.controller.HomeController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kevinwu on 2016-10-20.
 */
public class AppTest1 {

    @Test
    public void testApp() {

        HomeController hc = new HomeController();
        String result = hc.home();

        assertEquals(result, "Das Boot, reporting for duty!");
    }
}
