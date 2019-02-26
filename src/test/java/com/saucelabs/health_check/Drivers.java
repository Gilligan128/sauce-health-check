package com.saucelabs.health_check;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class Drivers {
    static ChromeDriver localResourceChromeDriver() {
        URL resource = Drivers.class.getClassLoader().getResource("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", resource.getPath());
        return new ChromeDriver();
    }
}
