package testsuite;

import browsefactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {

    String baseOrangeUrl = "https://opensource-demo.orangehrmlive.com/";
@Before

    public void setUpOrangeHomepage(){

    openBrowser_Orange(baseOrangeUrl); // opening browser using BaseTest method and passing url as parameter
}
@Test

    public void userShouldLoginSuccessfullyWithValidCredentials(){

    String expectedWelcomeMessage ="Welcome"; // this message is on real website

    sendTextToElement(By.id("txtUsername"),"Admin");
    sendTextToElement(By.id("txtPassword"),"admin123");
    clickOnElement(By.id("btnLogin"));
    Assert.assertTrue("Webpage doesn't contain Welcome message",getTextFromElement(By.id("welcome")).contains("Welcome"));

    driver.quit();// closing all the windows/browsers opened during test

    // Assert.assertTrue will check whether the actualWelcomeMessage retrieved from webpage contains 'Welcome'
    // word or not and if it does than return true and pass the test case otherwise error message will be displayed





   // driver.quit();
}


}
