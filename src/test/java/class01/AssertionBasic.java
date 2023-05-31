package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertionBasic {

    public static WebDriver driver;

    //preconditions
    @BeforeMethod
    public void SetupBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    //post condition
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    //testcase
    //enter the user name
    //enter the pass
    //click in login
    //verify that messAGE invalid credentials is displayed
    @Test
    public void invalidCredential(){
        //locate the web element user name and send keys

        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");

        // """" pass and ""'"''
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("abracadabra");

        //locate login and click
        WebElement loginbtn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        loginbtn.click();
        WebElement error = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String errormessage = error.getText();
        String expectedError = "Invalid credentials";
      /*  if(errormessage.equalsIgnoreCase(expectedError)){
            System.out.println("Test passed");
        }else{
            System.out.println("test failed");
        }*/
        //this assertion doing the same work with if else condition
        Assert.assertEquals(expectedError,errormessage);
        //pass text box is displayed
        //we have to find the element again becuase when we click in login btn the page refresh
        password = driver.findElement(By.xpath("//input[@id='txtPassword']"));

        boolean passdisplayed=password.isDisplayed();
        //verify that the text box is displayed or not
        Assert.assertTrue(passdisplayed);
    }

}
