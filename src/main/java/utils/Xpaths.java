package utils;

import org.openqa.selenium.By;

public class Xpaths {


    public static By UuserName = By.xpath("//input[@placeholder='Username']");
    public static By Upassword = By.xpath("//input[@placeholder=\"Password\"]");
    public static By UloginButton = By.xpath("//button[text() = ' Login ']");
    public static By errorMsgInvalid = By.xpath("//p[text()='Invalid credentials']");
    public static By errMsgRequired = By.xpath("//span[text()='Required']");
}
