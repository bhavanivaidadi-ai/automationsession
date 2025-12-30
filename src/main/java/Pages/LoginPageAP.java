package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CookieManager;

import java.time.Duration;

import static utils.Xpaths.*;

public class LoginPageAP {
    WebDriver driver;
    WebDriverWait wait;
    private boolean flagEmptyUsername = false;
    private boolean flagEmptyPassword = false;

    public LoginPageAP(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void usrName(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usrName));
        if (username.isEmpty()) {
            flagEmptyUsername = true;
        }
        driver.findElement(usrName).sendKeys(username);

        if (flagEmptyUsername) {
            System.out.println("Username is empty");
        }
    }

    public void passwrd(String passWord) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwrd));
        if (passWord.isEmpty()) {
            flagEmptyPassword = true;
        }
        driver.findElement(passwrd).sendKeys(passWord);

        if (flagEmptyPassword) {
            System.out.println("Password is empty");
        }
    }

    public void logs() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(logs));
        driver.findElement(logs).click();
    }

    public void navigate_loginPage() {

    boolean cookiesLoaded = CookieManager.loadCookies(driver);

    driver.navigate().refresh();

    if (cookiesLoaded) {
        System.out.println("Logged in using existing cookies. Skipping login page.");
    } else {
        System.out.println("No cookies. Login page will open normally.");
    }
    }

    public void validationofsuccess() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(validationofsuccess));

        String text = driver.findElement(validationofsuccess).getText();

        if (text.trim().equals("Success")) {
            System.out.println("Login successful → " + text);
        } else {
            System.out.println("Login failed → Found: " + text);
        }
    }
//
//    public void cancelClick(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(cancelClick));
//        driver.findElement(cancelClick).click();
//    }

    public void exploreClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(exploreClick));
        driver.findElement(exploreClick).click();
    }

    public String number(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(number));
        return driver.findElement(number).getText();

    }

    public void botClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(botClick));
        driver.findElement(botClick).click();
    }

    public void retrieveData(String num){
        wait.until(ExpectedConditions.visibilityOfElementLocated(retrieveData));
        driver.findElement(retrieveData).sendKeys(num);
    }

    public void clickonBot(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonBot));
        driver.findElement(clickonBot).click();
    }

}
