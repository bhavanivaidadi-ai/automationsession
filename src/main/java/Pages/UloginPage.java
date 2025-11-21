package Pages;

import driver.WebDriverInitializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Xpaths;

import java.time.Duration;
import java.util.List;

public class UloginPage {

    WebDriver driver;
    WebDriverWait wait;
    private boolean flagEmptyUsername = false;
    private boolean flagEmptyPassword = false;

    public UloginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void UuserName(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.UuserName));
        if (username.isEmpty()) {
            flagEmptyUsername = true;
        }
        driver.findElement(Xpaths.UuserName).sendKeys(username);

        if (flagEmptyUsername) {
            System.out.println("Username is empty");
        }
    }

    public void Upassword(String passWord) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.Upassword));
        if (passWord.isEmpty()) {
            flagEmptyPassword = true;
        }
        driver.findElement(Xpaths.Upassword).sendKeys(passWord);

        if (flagEmptyPassword) {
            System.out.println("Password is empty");
        }
    }

    public void UloginButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.UloginButton));
        driver.findElement(Xpaths.UloginButton).click();
    }


    public void navigate_loginPage() {
    }

    public void verifyDashboardVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.validation));
    }


    public void user_logged_successfully(){
//        String dashboardText = WebDriverInitializer.getDriver()
//                .findElement(Xpaths.validation)
//                .getText();
//
//        Assert.assertEquals(dashboardText, "Dashboard", "Dashboard");
        String dashboardText = WebDriverInitializer.getDriver()
                .findElement(Xpaths.validation)
                .getText();

        if ("Dashboard".equals(dashboardText)) {
            System.out.println("Dashboard is displayed correctly");
        } else {
            System.out.println("Unexpected Dashboard text: " + dashboardText);
        }

    }


    public void detectLoginStatus() {

        List<WebElement> dashboardElements = driver.findElements(Xpaths.validation);
        if (!dashboardElements.isEmpty()) {
            String text = dashboardElements.getFirst().getText();
            if ("Dashboard".equals(text)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Unexpected Dashboard text: " + text);
            }
            return;
        }

        List<WebElement> invalidElements = driver.findElements(Xpaths.errorMsgInvalid);
        if (!invalidElements.isEmpty()) {
            String errorText = invalidElements.getFirst().getText();
            if ("Invalid credentials".equals(errorText)) {
                System.out.println("Invalid Credentials");
            } else {
                System.out.println("Unexpected error text: " + errorText);
            }
            return;
        }

        List<WebElement> requiredElements = driver.findElements(Xpaths.errMsgRequired);
        if (!requiredElements.isEmpty()) {
            String requiredText = requiredElements.getFirst().getText();
            if ("Required".equals(requiredText)) {
                System.out.println("Required Field Missing");
            } else {
                System.out.println("Unexpected required field text: " + requiredText);
            }
            return;
        }

        System.out.println("No login result UI element was found!");
    }



}


