package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNgExample {
    //goto syntax hrms
    //enter the user name and pass
    //login
    //close

    public static  WebDriver driver;


    @BeforeMethod(alwaysRun = true)
    public void SetupBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test(groups = "regression")
    public void Loginfunction(){
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginbtn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        loginbtn.click();
    }
    //test case 2
    //verify that password text box is displayed on the log in page
    @Test
    public void passwordTestBoxVerfication(){
        //find the webelement password text box
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        System.out.println(password.isDisplayed());

    }

}
