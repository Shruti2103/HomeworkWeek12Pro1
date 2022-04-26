package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseurl = "https://demo.nopcommerce.com/";

    // click on login click
    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void navigateToRegisterPageSuccessfully() {
        //select registration link

        clickOnElement(By.linkText("Register"));

        // to varify write epected and actual message
        String expectedresult = "Register";

        String actualresult1 = getTextFromElement(By.xpath("//a[contains(text(),'Register')]"));
        //varify actual and expected
        Assert.assertEquals("Registration", expectedresult, actualresult1);


    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {

        // select registration link


        clickOnElement(By.linkText("Register"));
        //select gender radio button

        clickOnElement(By.xpath("//input[@id='gender-female']"));

        //Enter first name

        sendTextElement(By.xpath("//input[@id='FirstName']"), "Neha");
        // Enter the lastname

        sendTextElement(By.xpath("//input[@id='LastName']"), "Mittal");

        // select day month and year

        selectByVisibleTextFromDropDown(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]"), "21");
        // select month

        selectByVisibleTextFromDropDown(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]"), "March");
        //selecy year

        selectByVisibleTextFromDropDown(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]"), "1990");
        // Enter email address

        sendTextElement(By.xpath("//input[@id='Email']"), "abcd10@gmail.com");
        //pasword field

        sendTextElement(By.xpath("//input[@id='Password']"), "Sanketdesai");

        //confirmed password

        sendTextElement(By.xpath("//input[@id='ConfirmPassword']"), "Sanketdesai");
        // register button

        clickOnElement(By.name("register-button"));


        //check message
        String expectedresult = "REGISTER";

        String actualresult2 = getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println(actualresult2);

        //varify


        String expectedresult1 = "Your registration completed";

        String actual1 = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        Assert.assertEquals("Registration complete", expectedresult1, actual1);


    }


}
