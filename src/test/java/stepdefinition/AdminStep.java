package stepdefinition;

import Pages.AdminPage;
import driver.WebDriverInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AdminStep {

    AdminPage adminPage = new AdminPage(WebDriverInitializer.getDriver());

    @And("user click on Admin tab")
    public void click_on_admin_tab(){
        adminPage.AdminClick();
    }

    @And("user clicks on usermanagement dropdown")
    public void click_usrmng_dropdown(){
        adminPage.ursMngmt();
    }

    @And("user selects the users tab")
    public void click_usr_tab(){
        adminPage.users();
    }

    @Then("user check whether he entered correctly or not")
    public void validation(){
        adminPage.SystmemusrValidation();
    }

    @And("user delets the existing user details")
    public void delete_usr_details(){
        adminPage.trash();
    }
}
