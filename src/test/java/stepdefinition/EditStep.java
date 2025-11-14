package stepdefinition;

import Pages.EditPage;
import driver.WebDriverInitializer;
import io.cucumber.java.en.And;

public class EditStep {

    EditPage editPage = new EditPage(WebDriverInitializer.getDriver());

    @And("user clicking on Admin tab")
    public void user_clicks_admin_tab(){
        editPage.adminClick();
    }

    @And("user click on organization dropdown")
    public void usr_click_org_drpdown(){
        editPage.orgClick();
    }

    @And("user clicks on general information")
    public void usr_click_gnrl_info(){
        editPage.genInfoClick();
    }
}
