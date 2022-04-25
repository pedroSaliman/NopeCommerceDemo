package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistartionPage extends Base{
    RegistartionPage(WebDriver driver) {
        super(driver);
    }
    private By gender = By.xpath("//input[@id='gender-male']");
    private By fname = By.xpath("//input[@id='FirstName']");
    private By lname = By.xpath("//input[@id='LastName']");
    private By email = By.xpath("//input[@id='Email']");
    private By pass = By.xpath("//input[@id='Password']");
    private By company = By.xpath("//input[@id='Company']");
    private By conpass = By.xpath("//input[@id='ConfirmPassword']");
    private By submit = By.xpath("//button[@id='register-button']");

    public MyAccountPage enterregister(String firstname,String Lastname,String themail,String thecompany,String password,String confirmpass)

    {
        driver.findElement(gender).click();
        driver.findElement(fname).sendKeys(firstname);
        driver.findElement(lname).sendKeys(Lastname);
        driver.findElement(email).sendKeys(themail);
        driver.findElement(company).sendKeys(thecompany);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(conpass).sendKeys(confirmpass);
        driver.findElement(submit).click();
        return new MyAccountPage(driver);




    }








}
