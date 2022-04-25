package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends Base{
    ContactUsPage(WebDriver driver) {
        super(driver);
    }
    private By name = By.xpath("//input[@id='FullName']");
    private By email = By.xpath("//input[@id='Email']");
    private By message = By.xpath("//textarea[@id='Enquiry']");
    private By submit = By.xpath("//button[contains(text(),'Submit')]");
    public void sendinformation()
    {
        driver.findElement(name).sendKeys("walled");
        driver.findElement(email).sendKeys("walled@gmail.com");
        driver.findElement(message).sendKeys("this is awesome product");
        driver.findElement(submit).click();
    }
}
