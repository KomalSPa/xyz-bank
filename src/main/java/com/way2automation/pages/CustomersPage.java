package com.way2automation.pages;

import com.way2automation.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CustomersPage extends Utility {
    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By depositAmount = By.xpath("//input[@placeholder='amount']");
    By depositButton = By.xpath("//button[@type='submit']");
    By verifyDeposit = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By withdrawal = By.xpath("//button[normalize-space()='Withdrawl']");
    By withdrwalAmount = By.xpath("//input[@placeholder='amount']");
    By withdrawalButton = By.xpath("//button[normalize-space()='Withdraw']");
    By verifyWithdrawal = By.xpath("//span[contains(text(),'Transaction successful')]");

    public void clickOnDepositTab() {
clickOnElement(depositTab);
    }
    public void enterAmount(){
        sendTextToElement(depositAmount,"100");
    }
    public void clickOnDepositButton(){
        clickOnElement(depositButton);
    }
    public void verifyDeposit(){
        String expectedDepost = "Deposit Successful";
                String actualDeposit = getTextFromElement(verifyDeposit);
        Assert.assertEquals(actualDeposit,expectedDepost,"Not Matching Text");
    }
    public void clickOnWithdrawalTab(){
        clickOnElement(withdrawal);
    }
    public void enterWithdrawalAmount(){
        sendTextToElement(withdrwalAmount,"50");
    }
    public void clicOnWithdrwalButton(){
        clickOnElement(withdrawalButton);
    }
    public void verifyWithdrwalText(){
        String expectedWithdrawal = ("Transaction Successful");
        String actualWithdrawal = getTextFromElement(verifyWithdrawal);
        Assert.assertEquals(actualWithdrawal,expectedWithdrawal, "Not Matching Withdrawal");
    }
      }

