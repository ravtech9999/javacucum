package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
    //public static WebDriver d;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static WebDriver Driver(){
        return driver.get();
    }

    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver","Drivers/chrome83.exe");
        //d = new ChromeDriver();
        driver.set(new ChromeDriver());
    }
}
