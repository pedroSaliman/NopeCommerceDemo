package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistPage extends Base{
    WishlistPage(WebDriver driver) {
        super(driver);
    }
    public By totalprice = By.xpath("//span[@class='product-subtotal']");
  private   By qt=By.xpath("//input[@class='qty-input']");
  private   By update=By.xpath("//button[@id='updatecart']");
  private By removebtn = By.xpath("//button[@class='remove-btn']");
  private By message = By.className("no-data");
  public String getmessage()
  {
      return driver.findElement(message).getText();
  }

    public void wishlist(){
        driver.findElement(qt).clear();
        driver.findElement(qt).sendKeys("4");
        driver.findElement(update).click();
        driver.findElement(removebtn).click();

    }

}
