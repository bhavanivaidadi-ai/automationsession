package stepdefinition;

import Pages.LoginPageAP;
import driver.WebDriverInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepAP {

    LoginPageAP loginPageAP = new LoginPageAP(WebDriverInitializer.getDriver());

    @Given("user is in website login page")
    public void urs_in_login_page(){
        loginPageAP.navigate_loginPage();
    }

    @When("user enter their credentials {string} {string}")
    public void urs_enter_creds(String uname, String paswrd){
        loginPageAP.usrName(uname);
        loginPageAP.passwrd(paswrd);

    }

    @And("user click login button")
    public void usr_click_login_btn(){
        loginPageAP.logs();
    }

    @Then("user login is done successfully")
    public void usr_login_success(){
        loginPageAP.validationofsuccess();
    }

//    @And("user click cancel btn on popup msg")
//    public void cancle_click_on_popup(){
//        loginPageAP.cancelClick();
//    }

    @And("user click on a particular village")
    public void click_part_vlg(){
        loginPageAP.exploreClick();
    }

    @Then("user gets the phone number of a person from the village")
    public void gets_number(){
        loginPageAP.number();
    }

    @And("user opens the chat bot")
    public void open_bot(){
        loginPageAP.botClick();
    }

    @And("user uses the phone number and retrieve their details from bot")
    public void retrieving_details(){
        String num = loginPageAP.number();
        loginPageAP.retrieveData(num);
    }
    @And("user clicks on chatbot data entry button")
    public void entry_data(){
        loginPageAP.clickonBot();
    }
}
