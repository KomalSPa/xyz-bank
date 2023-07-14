package com.way2automation.pages;

import com.way2automation.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddCustomerPage extends Utility {
    By addCustomerButton = By.xpath("//button[@type='submit']");
    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");


    public void enterFirstName(){
        sendTextToElement(firstName,"Hono");
    }
    public void enterLastName(){
        sendTextToElement(lastName,"Lulu");
    }
    public void enterPostCode(){
        sendTextToElement(postCode,"HO0 1LU");
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }

    public void verifyAlertText (){

        String expected = "Customer added successfully with customer id :6";
        String actual = getAlertText();
        Assert.assertEquals(expected, actual, "incorrect text");
    }
    public void clickOkOnPopUp(){
        acceptAlert();
    }

}
