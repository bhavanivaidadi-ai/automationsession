package testrunner;

import driver.WebDriverInitializer;
import org.openqa.selenium.WebDriver;
import utils.SaveCookies;

public class SaveCookiesRunner {

    public static void main(String[] args) {

        // STEP 1: Initialize browser
        WebDriverInitializer initializer = new WebDriverInitializer();
        WebDriver driver = initializer.init_driver("chrome");

        // STEP 2: Open your login page
        driver.get("https://apaims2.0.vassarlabs.com/login");  // replace with your URL
        System.out.println("Browser opened. Please login manually and solve CAPTCHA.");

        // STEP 3: Wait for manual login, then save cookies
        SaveCookies.waitAndSaveCookies();

        // STEP 4: Quit browser
        driver.quit();
    }
}
