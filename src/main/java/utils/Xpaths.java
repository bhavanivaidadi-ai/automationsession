package utils;

import org.openqa.selenium.By;

public class Xpaths {


    //login functionalitity with positive and negative cases

    public static By UuserName = By.xpath("//input[@placeholder='Username']");
    public static By Upassword = By.xpath("//input[@placeholder=\"Password\"]");
    public static By UloginButton = By.xpath("//button[text() = ' Login ']");
    public static By errorMsgInvalid = By.xpath("//p[text()='Invalid credentials']");
    public static By errMsgRequired = By.xpath("//span[text()='Required']");
    public static By validation = By.xpath("//span[text()='Dashboard']");


    //profile

    public static By pimClcik = By.xpath("//a/span[text()='PIM']");
    public static By addEmpClick = By.xpath("//li/a[text()='Add Employee']");
    public static By empFName = By.xpath("//input[@name = 'firstName']");
    public static By empLName = By.xpath("//input[@placeholder='Last Name']");
    public static By empId = By.xpath("//label[text()='Employee Id']/ancestor::div[contains(@class,'oxd-input-group')]//input");
    public static By saveBtn = By.xpath("//button[text()=' Save ']");
    public static By toastMsg = By.xpath("//div[@id='oxd-toaster_1']");
    public static By EmpListClick = By.xpath("//li/a[text()='Employee List']");
    public static By employeeId = By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div//input");
    public static By searchClick = By.xpath("//button[text()=' Search ']");
    public static By editClick = By.xpath("//button/i[@class = 'oxd-icon bi-pencil-fill']");
    public static By dropDown = By.xpath("//div[@class = 'oxd-input-group__label-wrapper']/label[text()='Nationality']");
    public static By selctValue = By.xpath("//div[@class = 'oxd-select-text oxd-select-text--active']/div[text()='Sri Lankan']");



    //Admin status

    public static By AdminClick = By.xpath("//span[text()='Admin']");
    public static By ursMngmt = By.xpath("//li[@class = 'oxd-topbar-body-nav-tab --parent --visited']/span[text()='User Management ']");
    public static By users = By.xpath("//a[text()='Users']");
    public static By SystmemusrValidation = By.xpath("//h5[text()='System Users']");
    public static By trash = By.xpath("(//div[contains(@class,'oxd-table-cell-actions')])[1]//i[contains(@class,'bi-trash')]");

    //Apaims login
    public static By usrName = By.xpath("//input[@id = 'username']");
    public static By passwrd = By.xpath("//input[@id = 'password']");
    public static By logs = By.xpath("//button[@type ='submit']/span[text()='Login']");
    public static By validationofsuccess = By.xpath("//div[text()='Success']");
    //public static By cancelClick = By.xpath("//timesicon[@class ='p-component p-iconwrapper ng-tns-c2196985156-8 ng-star-inserted']");
    public static By exploreClick = By.xpath("//div[text()=' Anigeru ']");
    public static By number = By.xpath("//div[text()=' 9090683063 ']");
    public static By botClick = By.xpath("//a[.//span[normalize-space()='Knowledge Assistant']]");
    public static By retrieveData = By.xpath("//input[@placeholder ='Type a messege']");
    public static By clickonBot = By.xpath("//button[@class ='p-ripple p-button p-component p-button-sm bg-yellow-400 border-1 border-yellow-500 text-700']");
}
