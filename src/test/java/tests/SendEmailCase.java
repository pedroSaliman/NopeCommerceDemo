package tests;

import Pages.*;
import org.junit.Assert;
import org.testng.annotations.Test;

public class SendEmailCase extends Base{
    HomePage home;
    SearchPage search;
    WishlistPage wish;
    MyProductPage product;

    RegistartionPage reg;
    MyAccountPage acount;
    SendEmailPage emailpage;


    @Test
    void register() {
        Log4g.startcase("register");
        home = new HomePage(driver);
        reg = home.registerclick();
        acount = reg.enterregister(prop.getProperty("fname"), prop.getProperty("lname"), prop.getProperty("email1"), prop.getProperty("company"), prop.getProperty("pass"), prop.getProperty("conpass"));
        Log4g.endcase("register");

    }
    @Test(dependsOnMethods = {"register"})
    void search(){
        Log4g.startcase("search");
        home=new HomePage(driver);
        search= home.search(prop.getProperty("product1"));
        product= search.clicktoproductpage();
    emailpage=    product.email();
        Assert.assertEquals(emailpage.txt(),"Email a friend");
        Log4g.endcase("search");

    }
    @Test(dependsOnMethods = {"search"})
    void enterinfo()
    {
        Log4g.startcase("enterinfo");
emailpage=new SendEmailPage(driver);
emailpage.enterinformations(prop.getProperty("email1"), "this is good piece");
Assert.assertEquals(emailpage.txtmessage(),"Your message has been sent.");
        Log4g.endcase("enterinfo");

    }

}
