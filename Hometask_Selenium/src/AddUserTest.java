import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUserTest {
    private final Duration timeoutLoadPageInSeconds = Duration.ofSeconds(5);

    private final String loginUsername = "Admin";
    private final String loginPassword = "admin123";
    private final String addedEmployeeName = "Odis  Adalwin";//Odis  Adalwin
    private final String addedEmployeeUsername = "odissss";
    private final String addedEmployeePassword = "Odis1234#";

    private final WebDriver driver = new ChromeDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, timeoutLoadPageInSeconds);

    public AddUserTest(){
        driver.manage().window().maximize();
    }

    public void LoginToPage(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys(loginUsername);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(loginPassword);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

    }

    public void GoToUsersPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'User Management')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Users')]"))).click();

        try {TimeUnit.SECONDS.sleep(3);} catch (InterruptedException e) {e.printStackTrace();}

    }
    public void AddUser(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Add')]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='oxd-select-text-input']")));
        List<WebElement> selects =  driver.findElements(By.xpath("//div[@class='oxd-select-text-input']"));
        selects.get(0).click();
        selects.get(0).sendKeys("e");
        selects.get(0).sendKeys(Keys.RETURN);

        selects.get(1).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Enabled')]"))).click();

        List<WebElement> inputs =  driver.findElements(By.xpath("//input[@class='oxd-input oxd-input--active']"));
        inputs.get(1).click();
        inputs.get(1).sendKeys(addedEmployeeUsername);
        inputs.get(2).click();
        inputs.get(2).sendKeys(addedEmployeePassword);
        inputs.get(3).click();
        inputs.get(3).sendKeys(addedEmployeePassword);

        WebElement emloyeeName = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        emloyeeName.click();
        emloyeeName.sendKeys("Odis");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format("//span[contains(text(), '%s')]", addedEmployeeName)))).click();

        driver.findElement(By.xpath("//button[contains(.,\"Save\")]")).click();
        try {TimeUnit.SECONDS.sleep(5);} catch (InterruptedException e) {e.printStackTrace();}
    }

    public void SearchUser(){

        driver.findElements(By.xpath("//input[@class='oxd-input oxd-input--active']")).get(1).sendKeys(addedEmployeeUsername);

        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();

        try {TimeUnit.SECONDS.sleep(1);} catch (InterruptedException e) {e.printStackTrace();}

        try{
            driver.findElement(By.xpath(String.format("//div[contains(text(), '%s')]", addedEmployeeUsername))).isDisplayed();
        } catch (Exception e){
            System.out.println("User not found!");
        }
    }

    public void DeleteUser(){

        driver.findElements(By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space']")).get(0).click();
        driver.findElements(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).get(0).click();
    }
}
