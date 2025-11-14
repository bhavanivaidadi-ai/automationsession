package stepdefinition;

import Pages.ProfilePage;
import driver.WebDriverInitializer;
import io.cucumber.java.en.And;


public class ProfileStep {

    ProfilePage profilePage = new ProfilePage(WebDriverInitializer.getDriver());


    @And("user click on PIM module")
    public void click_pim_module(){
        profilePage.pimClcik();
    }

    @And("user click on add employee tab")
    public void click_add_emp_tab(){
        profilePage.addEmpClick();
    }
}

