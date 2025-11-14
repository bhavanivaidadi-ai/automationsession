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
    }

    public void Upassword(String passWord){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.Upassword));
        if(passWord.isEmpty()){
            flagEmptyPassword = true;
        }
        driver.findElement(Xpaths.Upassword).sendKeys(passWord);
    }
    public void UloginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.UloginButton));
        driver.findElement(Xpaths.UloginButton);
//
    }


    public void navigate_loginPage() {
    }


    public void errorMsgInvalid(){
        try {
            WebElement errmsg = driver.findElement((org.openqa.selenium.By) wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.errorMsgInvalid)));
            System.out.println(errmsg.getText());
        } catch (Exception e) {
            System.out.println("Error message not displayed");
        }
    }

    public void errMsgRequired(){
        try {
            WebElement errmsgg = driver.findElement((org.openqa.selenium.By) wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.errMsgRequired)));
            System.out.println(errmsgg.getText());
        } catch (Exception e) {
            System.out.println("Error message not displayed here");
        }
    }

}


