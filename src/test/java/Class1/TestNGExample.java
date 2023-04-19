package Class1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGExample {

/*
test1
go to syntax Hrms
enter the username and password , verify that u logged in
close the browser
 */
    public static WebDriver driver;
    // pre conditions---> to open the browser
                         // to set implicit wait
    @BeforeMethod(alwaysRun = true)
    public void SetupBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    // post-condition- -> to close the browser
    @AfterMethod(alwaysRun = true)
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    // test case 1
    // verify login functionality
    @Test(groups = "regression")
    public void loginFunctionality(){
       WebElement username =driver.findElement(By.xpath("//input[@name='txtUsername']"));
       username.sendKeys("Admin");
       WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
       password.sendKeys("Hum@nhrm123");
       WebElement loginBtn=driver.findElement(By.xpath("//*[@id='btnLogin']"));
       loginBtn.click();
    }

    // test case 2
    // verify that password textbox is displayed on the login Page
    @Test
    public void passwordTestBoxVerification(){
        // find the webElement password text box
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        System.out.println(password.isDisplayed());
    }
}
