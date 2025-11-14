package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Xpaths;

import java.time.Duration;

public class ProfilePage {
    WebDriver driver;
    WebDriverWait wait;
    public ProfilePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void pimClcik(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.pimClcik));
        driver.findElement(Xpaths.pimClcik).click();
    }

    public void addEmpClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Xpaths.addEmpClick));
        driver.findElement(Xpaths.addEmpClick).click();
    }


}
