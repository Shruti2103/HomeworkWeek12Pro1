package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseurl = "https://demo.nopcommerce.com/";

    // click on login click
    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void navigateToComputerPageSuccessfully() {

        // find login link and click on log in link
     //   WebElement loginlink = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
     //   loginlink.click();
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));

        String expectedresult = "Computers";
     //   WebElement actualresult = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
     //   String actualresult1 = actualresult.getText();
    //    System.out.println(actualresult1);
     String actualresult1=   getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        //varify the test
        Assert.assertEquals("User can click computer sucessfully", expectedresult, actualresult1);

    }

    @Test
    public void navigateToElectronicsPageSuccessfully() {
        //find login link and click on log in Link
      //  WebElement loginlink = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
       // loginlink.click();
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        String expectedresult = "Electronics";
      //  WebElement actualresult = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
     //   String actualresult1 = actualresult.getText();
     //   System.out.println(actualresult1);
        String actualresult1=getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        //Varify the test
        Assert.assertEquals("Electronics", expectedresult, actualresult1);


    }

    @Test
    public void navigateToApparelPageSuccessfully() {
        //find log in link and click on login link
     //   WebElement loginlink = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
      //  loginlink.click();
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        String expectedresult = "Apparel";
      //  WebElement actualresult = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
     //   String actualresult1 = actualresult.getText();
     //   System.out.println(actualresult1);
        String actualresult1=getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        //varify the test
        Assert.assertEquals("Appreal clickable", expectedresult, actualresult1);

     ////body/div[6]/div[2]/ul[1]/li[3]/a[1]
    }

    @Test
    public void NavigateToDigitalDownloadsPageSuccessfully() {
        // find click to click on login
     //   WebElement loginlink = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
     //   loginlink.click();
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        String expectedresult = "Digital downloads";
      //  WebElement actualresult = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
      //  actualresult.getText();
     //   String actualresult1 = actualresult.getText();
      //  System.out.println(actualresult1);
        String actualresult1=getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        //varify the test
        Assert.assertEquals("Digital Downloads", expectedresult, actualresult1);


    }
    @Test
    public void navigateToBooksPageSuccessfully(){
        // find click to click on login
     //   WebElement loginlink=driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
     //  loginlink.click();
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
       String expectedresult="Books";
    //   WebElement actualresult=driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
     //  actualresult.getText();
    //   String actualresult1=actualresult.getText();
     //   System.out.println(actualresult1);
        String actualresult1=getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        //varify the result
        Assert.assertEquals("Books display",expectedresult,actualresult1);




    }
    @Test
    public void navigateToJewelryPageSuccessfully(){
        // find the ckick to login
     //   WebElement loginclick=driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
     //   loginclick.click();
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        String epectedresult="Jewelry";
      //  WebElement actualresult=driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
     //   actualresult.getText();
     //   String actualresult1=actualresult.getText();
    //    System.out.println(actualresult1);
        String actualresult1=getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        // varify the results
        Assert.assertEquals("Jwellery",epectedresult,actualresult1);



    }
    @Test
    public void navigateToGiftCardsPageSuccessfully(){
        // find the click to login
     //   WebElement loginclick=driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
     //   loginclick.click();
        clickOnElement(By.xpath("/body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        String expectedresult="Gift Cards";
     //   WebElement actualresult=driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
    //   String actualresult1= actualresult.getText();
    //    System.out.println(actualresult1);
        String actualresult1=getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
       // Assert actual and expected result
        Assert.assertEquals("Gif cards chore functionality",expectedresult,actualresult1);

    }
    @After
    public void closetest(){
        closeBrowser();
    }



}
