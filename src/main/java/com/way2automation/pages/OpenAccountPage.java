package com.way2automation.pages;

import com.way2automation.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OpenAccountPage extends Utility {
    By openAccountPage = By.xpath("//button[normalize-space()='Open Account']");
    By searchCustomer = By.xpath("//select[@id='userSelect']");

    By currancy = By.xpath("//select[@id='currency']");

    By process = By.xpath("//button[contains(text(),'Process')]");
    public void clickOnOpenAccountPage()
    {
        clickOnElement(openAccountPage);
    }

    public void searchCustomerJack()

    {
        selectByVisibleTextFromDropDown(searchCustomer,"Harry Potter");
    }

    public void selectCurrancy(){
        selectByVisibleTextFromDropDown(currancy, "Pound");

    }
    public void clickOnProcessButton(){
        clickOnElement(process);
    }

    public void verifyAlertMessag2() {

        String actual = getAlertText();
        String expected = "Account created successfully with account Number :1016";
        Assert.assertEquals(expected, actual, "incorrect text");
    }
    public void clickOkOnPopUp() {
        acceptAlert();

    }
}
