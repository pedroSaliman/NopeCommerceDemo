package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class HomePage extends Base{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    JavascriptExecutor js = (JavascriptExecutor) driver;
    private By register = By.xpath("//a[contains(text(),'Register')]");
    private By contact = By.xpath("//a[contains(text(),'Contact us')]");
    private By computer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    private By desktop = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
    private  By searchbar = By.xpath("//input[@id='small-searchterms']");
    private  By searchbtn = By.xpath("//button[contains(text(),'Search')]");
    private By select = By.xpath("//select[@id='customerCurrency']");
    private By login = By.xpath("//a[contains(text(),'Log in')]");
    public LoginPage log(){
        driver.findElement(login).click();
        return new LoginPage(driver);
    }
    public void select(){
       WebElement selectt= driver.findElement(select);
       Select selec= new Select(selectt);
       selec.selectByVisibleText("Euro");
    }
    public SearchPage search(String computer){
        driver.findElement(searchbar).sendKeys(computer);
        driver.findElement(searchbtn).click();
        return new SearchPage(driver);
    }


public void hover(){
    Actions act = new Actions(driver);
    act.moveToElement(driver.findElement(computer)).moveToElement(driver.findElement(desktop)).click().perform();
}
public ContactUsPage contact(){
js.executeScript("window.scrollBy(0,1000)");
driver.findElement(contact).click();
return new ContactUsPage(driver);
}
public RegistartionPage registerclick(){
        driver.findElement(register).click();
        return new RegistartionPage(driver);
}

}
