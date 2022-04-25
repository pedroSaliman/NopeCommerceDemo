package tests;

import Pages.*;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReviewCase extends Base {


    SearchPage search;
    HomePage home;
    MyProductPage product;
    RegistartionPage reg;
    MyAccountPage acount;
    ReviewPage rev;

    @Test
    void register() {
        Log4g.startcase("register");
        home = new HomePage(driver);
        reg = home.registerclick();
        acount = reg.enterregister(prop.getProperty("fname"), prop.getProperty("lname"), prop.getProperty("email2"), prop.getProperty("company"), prop.getProperty("pass"), prop.getProperty("conpass"));
        Log4g.endcase("register");

    }

    @Test(dependsOnMethods = {"register"})
    void search(){
        Log4g.startcase("search");
        home=new HomePage(driver);
        search= home.search(prop.getProperty("product1"));
        product= search.clicktoproductpage();
      rev=  product.review();
      rev.review();
        Assert.assertEquals(rev.txt(),"Product review is successfully added.");
        Log4g.endcase("search");

    }



























}