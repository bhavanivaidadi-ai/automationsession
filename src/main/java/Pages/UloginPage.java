package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Xpaths;

import java.time.Duration;

public class UloginPage {

    WebDriver driver;
    WebDriverWait wait;
    private boolean flagEmptyUsername = false;
    private boolean flagEmptyPassword = false;
    public UloginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void UuserName(String username){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.UuserName));
        if(username.isEmpty()){
            flagEmptyUsername = true;
        }
        driver.findElement(Xpaths.UuserName).sendKeys(username);

        if(flagEmptyUsername){
            System.out.println("Username is empty");
        }

    }

    public void Upassword(String passWord){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.Upassword));
        if(passWord.isEmpty()){
            flagEmptyPassword = true;
        }
        driver.findElement(Xpaths.Upassword).sendKeys(passWord);

        if(flagEmptyPassword){
            System.out.println("Password is empty");
        }
    }
    public void UloginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.UloginButton));
        driver.findElement(Xpaths.UloginButton).click();

    }


    public void navigate_loginPage() {
    }


    public void errorMsgInvalid(){

        WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.errorMsgInvalid));

        if (errorElement != null) {
            System.out.println(errorElement.getText());
        } else {
            System.out.println("Error message not displayed");
        }

    }

    public void errMsgRequired(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.errMsgRequired));

        WebElement element = driver.findElement(Xpaths.errMsgRequired);

        if (element.isDisplayed()) {
            System.out.println(element.getText());
        } else {
            System.out.println("Error message not displayed here");
        }

    }

}


