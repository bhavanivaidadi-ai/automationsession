package stepdefinition;

import Pages.ProfilePage;
import driver.WebDriverInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class ProfileStep {

    ProfilePage profilePage = new ProfilePage(WebDriverInitializer.getDriver());


    @And("I click on PIM module")
    public void click_pim_module(){
        profilePage.pimClcik();
    }

    @And("I click on add employee tab")
    public void click_add_emp_tab(){
        profilePage.addEmpClick();
    }

    @When("I enters {string} and {string}")
    public void entr_fname_lname(String EmpFName,String EmpLName){
        profilePage.empFName(EmpFName);
        profilePage.empLName(EmpLName);

    }

    @When("I create unique {string}")
    public void create_unique_id(String EmpId){
        profilePage.empId(EmpId);
    }

    @And("I click save button")
    public void click_save_btn(){
        profilePage.saveBtn();
    }

    @And("I click Employee list")
    public void click_emp_list(){
        profilePage.EmpListClick();
    }
}

