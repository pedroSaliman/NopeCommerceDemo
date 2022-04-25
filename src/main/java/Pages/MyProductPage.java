package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PrivateKey;
import java.time.Duration;

public class MyProductPage extends Base{
    MyProductPage(WebDriver driver) {
        super(driver);
    }

private By review = By.xpath("//a[contains(text(),'Add your review')]");
    private By wishlistlink = By.xpath("//button[@id='add-to-wishlist-button-4']");
    private By sendemail = By.xpath("//div[@class='email-a-friend']/child::button[1]");
    private By comparelnk = By.xpath("//div[@class='compare-products']/child::button");
    private By linkbarforcompare = By.xpath("//a[contains(text(),'product comparison')]");

    public ComparePage compareclick()
    {
        driver.findElement(comparelnk).click();
        WebElement wish= new WebDriverWait(driver, Duration.ofSeconds(100)).until(ExpectedConditions.elementToBeClickable(linkbarforcompare));
                wish.click();

       // driver.findElement(linkbarforcompare).click();
        return new ComparePage(driver);
    }

    public SendEmailPage email()
    {
        driver.findElement(sendemail).click();
        return new SendEmailPage(driver);
    }

    //////////////////////////////////
    public WishlistPage wish(){
        driver.findElement(wishlistlink).click();

        WebElement wish= new WebDriverWait(driver, Duration.ofSeconds(100)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'wishlist')]")));

        wish.click();
        return new WishlistPage(driver);
    }


public ReviewPage review()
{
    driver.findElement(review).click();
    return new ReviewPage(driver);
}
}
