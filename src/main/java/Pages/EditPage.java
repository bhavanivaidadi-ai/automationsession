package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Xpaths;

import java.time.Duration;

public class EditPage {
    WebDriver driver;
    WebDriverWait wait;
    public EditPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void adminClick(){
        wait.until(ExpectedConditions.elementToBeClickable(Xpaths.adminClick));
        driver.findElement(Xpaths.adminClick).click();
    }

    public void orgClick(){
        wait.until(ExpectedConditions.elementToBeClickable(Xpaths.orgClick));
        driver.findElement(Xpaths.orgClick).click();
    }


    public void genInfoClick(){
        wait.until(ExpectedConditions.elementToBeClickable(Xpaths.genInfoClick));
        driver.findElement(Xpaths.genInfoClick).click();
    }

}
