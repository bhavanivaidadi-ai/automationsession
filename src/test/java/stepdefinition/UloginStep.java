package stepdefinition;

import Pages.UloginPage;
import driver.WebDriverInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UloginStep {
    UloginPage uloginPage = new UloginPage(WebDriverInitializer.getDriver());

    @Given("user is on login page")
    public void user_on_login_page() {
        uloginPage.navigate_loginPage();
    }

    @When("user enters \"Admin\" and \"admin123\"")
    public void user_enters_uname_upaswrd() {
        uloginPage.UuserName("Admin");
        uloginPage.Upassword("admin123");
    }

    @And("user clicks on login button")
    public void user_clicks_login_btn() {
        uloginPage.UloginButton();
    }

    @Then("user is successfully logged in")
    public void user_logged_successfully() {

    }

    @When("user enters {string} {string}")
    public void user_enter_name_pass(String username, String password ){
        uloginPage.UuserName(username);
        uloginPage.Upassword(password);
    }

    @Then("user get this {string}")
    public void user_get_this_msg(String message){
        switch (message) {
            case "Invalid credentials":
                System.out.println("Login failed: Username or password is incorrect.");
                break;
            case "Required":
                System.out.println("Login failed: Username or password is required.");
                break;
            case "Required & Invalid credentials":
                System.out.println("Login failed: Username and password is required.");
            default:
                System.out.println("Login status failed.");
        }

    }
}
