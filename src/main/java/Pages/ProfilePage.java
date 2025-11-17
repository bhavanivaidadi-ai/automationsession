package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Xpaths;

import java.time.Duration;

import static utils.Xpaths.*;

public class ProfilePage {
    WebDriver driver;
    WebDriverWait wait;
    private boolean flagEmptyEmpFName = false;
    private boolean flagEmptEmpLName = false;
    private boolean flagEmptyEmpId = false;
    public ProfilePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void pimClcik(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pimClcik));
        driver.findElement(pimClcik).click();
    }

    public void addEmpClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(addEmpClick));
        driver.findElement(addEmpClick).click();
    }


    public void empFName(String EmpFName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(empFName));
        if(EmpFName.isEmpty()){
            flagEmptyEmpFName = true;
        }
        driver.findElement(empFName).sendKeys(EmpFName);

        if(flagEmptyEmpFName){
            System.out.println("First name is empty");
        }
    }

    public void empLName(String EmpLName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(empLName));
        if (EmpLName.isEmpty()){
            flagEmptEmpLName = true;
        }
        driver.findElement(empLName).sendKeys(EmpLName);

        if(flagEmptEmpLName){
            System.out.println("Last Name is empty");
        }

    }

    public void empId(String EmpId){
        wait.until(ExpectedConditions.visibilityOfElementLocated(empId));
        if (EmpId.isEmpty()){
            flagEmptyEmpId = true;
        }
        WebElement empID = driver.findElement(empId);
        empID.clear();
        empID.sendKeys(EmpId);

        if(flagEmptyEmpId){
            System.out.println("Emp ID is empty");
        }
    }

    public void saveBtn(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveBtn));
        driver.findElement(saveBtn).click();
    }

    public void EmpListClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmpListClick));
        driver.findElement(EmpListClick).click();
    }
}
