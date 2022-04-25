package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendEmailPage extends Base{
    public SendEmailPage(WebDriver driver) {
        super(driver);
    }
    private By h1 = By.xpath("//h1[text()='Email a friend']");
    private By emailfriend = By.xpath("//input[@id='FriendEmail']");
    private By txtarea = By.xpath("//textarea[@id='PersonalMessage']");
    private By button = By.xpath("//button[contains(text(),'Send email')]");
    private By message = By.className("result");
    public String txtmessage()
    {
        return driver.findElement(message).getText();
    }
    public void enterinformations(String email,String txt){
        driver.findElement(emailfriend).sendKeys(email);
        driver.findElement(txtarea).sendKeys(txt);
        driver.findElement(button).click();
    }
    public String txt()
    {
        return driver.findElement(h1).getText();
    }
}
