package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends Base{
    MyAccountPage(WebDriver driver) {
        super(driver);
    }
    private By logout = By.xpath("//a[contains(text(),'Log out')]");
    public HomePage logout(){
        driver.findElement(logout).click();
        return new HomePage(driver);
    }
}
