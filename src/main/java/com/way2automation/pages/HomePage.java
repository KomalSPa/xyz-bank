package com.way2automation.pages;

import com.way2automation.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
By BankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");

    public void clickOnBankManagerLogin () {
        clickOnElement(BankManagerLogin);
    }
    public void clickOnCustomerLogin(){
        clickOnElement(customerLogin);
    }

}
