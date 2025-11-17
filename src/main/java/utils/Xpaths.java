package utils;

import org.openqa.selenium.By;

public class Xpaths {


    //login functionalitity with positive and negative cases
    public static By UuserName = By.xpath("//input[@placeholder='Username']");
    public static By Upassword = By.xpath("//input[@placeholder=\"Password\"]");
    public static By UloginButton = By.xpath("//button[text() = ' Login ']");

    //profile

    public static By pimClcik = By.xpath("//a/span[text()='PIM']");
    public static By addEmpClick = By.xpath("//li/a[text()='Add Employee']");
    public static By addBtn = By.xpath("//button[text()=' Add ']");
    public static By empFName = By.xpath("//input[@name = 'firstName']");
    public static By empLName = By.xpath("//input[@placeholder='Last Name']");
    public static By empId = By.xpath("//label[text()='Employee Id']/ancestor::div[contains(@class,'oxd-input-group')]//input");
    public static By saveBtn = By.xpath("//button[text()=' Save ']");
    public static By EmpListClick = By.xpath("//li/a[text()='Employee List']");


}
