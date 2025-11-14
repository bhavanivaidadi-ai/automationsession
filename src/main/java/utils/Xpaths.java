package utils;

import org.openqa.selenium.By;

public class Xpaths {


    //login functionalitity with positive and negative cases
    public static By UuserName = By.xpath("//input[@placeholder='Username']");
    public static By Upassword = By.xpath("//input[@placeholder=\"Password\"]");
    public static By UloginButton = By.xpath("//button[text() = ' Login ']");
    public static By errorMsgInvalid = By.xpath("//p[text()='Invalid credentials']");
    public static By errMsgRequired = By.xpath("//span[text()='Required']");


    //Edit feature

    public static By adminClick = By.xpath("//a/span[text()='Admin']");
    public static By orgClick = By.xpath("//span[text()='Organization ']");
    public static By genInfoClick = By.xpath("//a[text() = 'General Information']");
}
