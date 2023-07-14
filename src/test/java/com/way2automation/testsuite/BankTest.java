package com.way2automation.testsuite;

import com.way2automation.pages.*;
import com.way2automation.testbase.BaseTest;
import org.testng.annotations.Test;


public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();


    /**
     * click On "Bank Manager Login" Tab
     * click On "Add Customer" Tab
     * enter FirstName
     * enter LastName
     * enter PostCode
     * click On "Add Customer" Button
     * popup display
     * verify message "Customer added successfully"
     * click on "ok" button on popup.
     */
    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.verifyAlertText();
        addCustomerPage.clickOkOnPopUp();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLogin();
        openAccountPage.clickOnOpenAccountPage();
        openAccountPage.searchCustomerJack();
        openAccountPage.selectCurrancy();
        openAccountPage.clickOnProcessButton();
        openAccountPage.verifyAlertMessag2();
        openAccountPage.clickOkOnPopUp();
    }

    @Test
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        homePage.clickOnCustomerLogin();
        customerLoginPage.searchJack3();
        customerLoginPage.clickOnLogin3();
        customerLoginPage.verifyLogOutTab();
        customerLoginPage.clickonLogout();
        customerLoginPage.verifyyourNameDisplay();
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLogin();
        customerLoginPage.searchJack3();
        customerLoginPage.clickOnLogin3();
        customersPage.clickOnDepositTab();
        customersPage.enterAmount();
        customersPage.clickOnDepositButton();
        customersPage.verifyDeposit();
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnCustomerLogin();
        customerLoginPage.searchJack3();
        customerLoginPage.clickOnLogin3();
        customersPage.clickOnWithdrawalTab();
        customersPage.enterWithdrawalAmount();
        customersPage.clicOnWithdrwalButton();
        customersPage.verifyWithdrwalText();

    }

}