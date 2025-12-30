package utils;

import driver.WebDriverInitializer;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class SaveCookies {
    public static void waitAndSaveCookies() {

        WebDriver driver = WebDriverInitializer.getDriver();

        System.out.println("Please solve CAPTCHA manually and login into the application.");
        System.out.println("After reaching dashboard, press ENTER to save cookies...");

        Scanner sc = new Scanner(System.in);
        sc.nextLine();  // waits for ENTER key

        CookieManager.saveCookies(driver);

        System.out.println("Cookies saved successfully!");
    }
}

