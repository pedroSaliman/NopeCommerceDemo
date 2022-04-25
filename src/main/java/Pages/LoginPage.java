package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base{
    LoginPage(WebDriver driver) {
        super(driver);
    }
    private By email = By.xpath("//input[@id='Email']");
    private By pass = By.xpath("//input[@id='Password']");
    private By button = By.xpath("//button[contains(text(),'Log in')]");
    public void enterinfo(String themail,String password)
    {
        driver.findElement(email).sendKeys(themail);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(button).click();
    }


}
