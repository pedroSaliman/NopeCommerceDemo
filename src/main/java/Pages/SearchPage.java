package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends Base{
    SearchPage(WebDriver driver) {
        super(driver);

    }

   private By searchlink = By.xpath("//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]");

public MyProductPage clicktoproductpage() {
    driver.findElement(searchlink).click();
    return new MyProductPage(driver);
}
}
