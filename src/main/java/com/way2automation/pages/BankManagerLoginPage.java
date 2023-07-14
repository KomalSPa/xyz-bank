package com.way2automation.pages;

import com.way2automation.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By openAccount = By.xpath("//button[normalize-space()='Open Account']");
    By customerTab = By.xpath("//button[normalize-space()='Customers']");
    public void clickOnAddCustomer () {
        clickOnElement(addCustomer);
    }
    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }
    public void clickOnCustomerTab(){
        clickOnElement(customerTab);
    }
}
