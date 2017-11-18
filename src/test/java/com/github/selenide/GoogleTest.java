package com.github.selenide;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.AllureIntegrationListener;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertTrue;

@Listeners({AllureIntegrationListener.class})
public class GoogleTest {

    @BeforeMethod
    public void setUp() throws Exception {
        Configuration.browser = "chrome";
        ChromeDriverManager.getInstance().setup();
    }

    @Test
    public void passedTest() {
        open("https://www.google.ru/?hl=en");
    }

    @Test
    public void failedTest() {
        open("https://www.google.ru/?hl=en");
        assertTrue("Title is wrong", false);
    }

}
