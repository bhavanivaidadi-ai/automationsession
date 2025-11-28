package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static utils.Xpaths.*;

public class AdminPage {
    WebDriver driver;
    WebDriverWait wait;
    public AdminPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }


    public void AdminClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AdminClick));
        driver.findElement(AdminClick).click();
    }

    public void ursMngmt(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ursMngmt));
        driver.findElement(ursMngmt).click();
    }

    public void users(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(users));
        driver.findElement(users).click();
    }

    public void SystmemusrValidation(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SystmemusrValidation));
        String dashboardText = driver.findElement(SystmemusrValidation).getText();
        if (dashboardText.equals("System Users")) {
            System.out.println(dashboardText);
        } else {
            System.out.println("Fail: Expected 'System Users' but found: " + dashboardText);
        }

    }

    public void trash(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(trash));
        driver.findElement(trash).click();
    }

}
