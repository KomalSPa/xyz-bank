package com.way2automation.pages;

import com.way2automation.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CustomerLoginPage extends Utility {

   By searchJack = By.xpath("//select[@id='userSelect']");
   By login = By.xpath("//button[contains(text(),'Login')]");

   By logout = By.xpath("//button[contains(text(),'Logout')]");

   By verifyYourName = By.xpath("//label[contains(text(),'Your Name :')]");


   public void searchJack3(){
      selectByVisibleTextFromDropDown(searchJack, "Harry Potter");

   }

   public void clickOnLogin3(){
      clickOnElement(login);

   }
   public void verifyLogOutTab() throws InterruptedException {
      Thread.sleep(2000);
      String expected = "Logout";

      String actual = getTextFromElement(logout);

      Assert.assertEquals(actual, expected, "Not Displayed Logout Tab");

   }

   public void clickonLogout(){
      clickOnElement(logout);
   }
   public void verifyyourNameDisplay(){

      String expectedYourName = "Your Name :";
      String actualYourNAme = getTextFromElement(verifyYourName);
      Assert.assertEquals(actualYourNAme, expectedYourName, "Wrong Displayed");
   }
}
