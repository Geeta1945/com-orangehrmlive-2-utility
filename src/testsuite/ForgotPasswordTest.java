package testsuite;
/*Write down the following test into ‘ForgotPasswordTest’ class 1. userShouldNavigateToForgotPasswordPageSuccessfully
*click on the ‘Forgot your password’ link * Verify the text ‘Forgot Your Password?’
*/
import browsefactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class ForgotPasswordTest extends Utility {

    String baseOrangeUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUpOrangeHomepage(){

        openBrowser_Orange(baseOrangeUrl); // opening browser using BaseTest method and passing url as parameter
    }
    @Test

    public void forgotPasswordTest(){


        clickOnElement(By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']"));

        Assert.assertEquals("Forgot Your Password?",getTextFromElement(By.xpath("//h1[text()='Forgot Your Password?']")));


        
        // Comparing both actual and expected messages and if not matched than error message will be displayed otherwise
        // test will be passed

        driver.quit();




    }


}
