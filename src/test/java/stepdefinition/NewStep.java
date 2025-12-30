//package stepdefinition;
//
//import Pages.NewPage;
//import driver.WebDriverInitializer;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class NewStep {
//    NewPage newPage = new NewPage(WebDriverInitializer.getDriver());
//
//    @Given("user is in website login page")
//    public void urs_in_login_page(){
//        newPage.navigate_loginPage();
//    }
//
//    @When("user enter their credentials {string} {string}")
//    public void urs_enter_creds(String uname, String paswrd){
//        newPage.usrName(uname);
//        newPage.passwrd(paswrd);
//
//    }
//
//    @And("user click login button")
//    public void usr_click_login_btn(){
//       newPage.logs();
//    }
//
//    @Then("user login is done successfully")
//    public void usr_login_success(){
//        newPage.validationofsuccess();
//    }
//
//    @And("user click cancel btn on popup msg")
//    public void cancle_click_on_popup(){
//        newPage.cancelClick();
//    }
//
//    @And("user click on a particular village")
//    public void click_part_vlg(){
//        newPage.exploreClick();
//    }
//
//    @Then("user gets the phone number of a person from the village")
//    public void gets_number(){
//        newPage.number();
//    }
//
//    @And("user opens the chat bot")
//    public void open_bot(){
//        newPage.botClick();
//    }
//
//    @And("user uses the phone number and retrieve their details from bot")
//    public void retrieving_details(){
//        String num = newPage.number();
//        newPage.retrieveData(num);
//    }
//}
