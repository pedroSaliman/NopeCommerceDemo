package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparePage extends Base{
    ComparePage(WebDriver driver) {
        super(driver);
    }
    private By message =By.xpath("//h1[text()='Compare products']");
    private By clear = By.xpath("//div[@class='page-body']/child::a");
    private By afterclear = By.xpath("//div[@class='no-data']");

    public void click()
    {
        driver.findElement(clear).click();
    }

public String getmessage(){
    return driver.findElement(message).getText();
}
///////////////////////
    public String getmessageafterclear(){
        return driver.findElement(afterclear).getText();
    }
}
