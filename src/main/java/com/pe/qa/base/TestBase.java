package com.pe.qa.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public TestBase(){
        prop=new Properties();
        try {
            FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"src/main/java/com/pe/qa/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void initialization(){
        String browserName=prop.getProperty("browser");
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else if(browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }
}
