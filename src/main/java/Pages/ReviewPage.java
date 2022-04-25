package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewPage extends Base{
    ReviewPage(WebDriver driver) {
        super(driver);
    }
    private By reviewtittle=By.xpath("//input[@id='AddProductReview_Title']");
    private By reviewtext = By.xpath("//textarea[@id='AddProductReview_ReviewText']");
    private By rate = By.xpath("//input[@id='addproductrating_2']");
    private By submit = By.xpath("//button[contains(text(),'Submit review')]");
    public By result = By.className("result");
    public String txt()
    {
       return driver.findElement(result).getText();

    }


    public void review(){
        driver.findElement(reviewtittle).sendKeys("product");
        driver.findElement(reviewtext).sendKeys("this is awesome");
        driver.findElement(rate).click();
        driver.findElement(submit).click();
    }
}
