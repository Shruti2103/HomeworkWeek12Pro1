package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseurl = "https://demo.nopcommerce.com/";

    // click on login link
    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void varifyUserShouldNavigateToLoginPageSucessfully() {

        clickOnElement(By.linkText("Log in"));
        // This is from requirement for display message
        String expectedMessage = "Welcome, Please Sign In!";

        String actualMessage=getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        // validate expexted message
        Assert.assertEquals("Not Nevigate to login page", expectedMessage, actualMessage);


    }

    @After
    public void testDown() {
        closeBrowser();
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        clickOnElement(By.linkText("Log in"));

        // find emailfield element

         sendTextElement(By.id("Email"),"abcd10@gmail.com");

        // find the password field

        sendTextElement(By.id("Password"),"Sanketdesai");

        // click log in after email and password

        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        // varify logout
        String expectedMessage = "Log out";


       String actualresult=getTextFromElement(By.linkText("Log out"));
        System.out.println(actualresult);
        Assert.assertEquals("Logout sucessfully", expectedMessage, actualresult);

        // log out

       clickOnElement(By.xpath("//a[contains(text(),'Log out')]"));
    }

    @Test
    public void TheErrorMessage() {
        // click on Login link

        clickOnElement(By.linkText("Log in"));
        // find invalid emailfield

        sendTextElement(By.name("Email"),"kinjal.....@gmail.com");


        //find password field invalid

        sendTextElement(By.id("Password"),"123");

        // click lof in after email and password

        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        // expexted message
        String expectedmessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //actual message

      String actualmessageElement1=  getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        //varify the test
        Assert.assertEquals("Login was unsucessful please correct the error and try again", expectedmessage, actualmessageElement1);


    }
    @After
    public void closetest(){
        closeBrowser();
    }
    

}


