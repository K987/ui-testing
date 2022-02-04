package hu.test.selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class SimpleTest {

    private WebDriver driver;

    @Test
    public void baseTest() {
        driver = DriverFactory.createChromeDriver();
        //localhost from container
        driver.get("http://172.17.0.1:8080/");
        String title = driver.getTitle();

        assertEquals("SystemUnderTest", title);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
