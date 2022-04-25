package tests;

import Pages.HomePage;
import Pages.MyProductPage;
import Pages.SearchPage;
import Pages.*;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class CompareCase extends Base{
    HomePage home;
    SearchPage search;
    WishlistPage wish;
    MyProductPage product;
    ComparePage com;

    @Test
    void searchformac(){
        Log4g.startcase("searchformac");

        home=new HomePage(driver);
        search= home.search(prop.getProperty("product1"));
        product= search.clicktoproductpage();
      product.compareclick();
        Log4g.endcase("searchformac");

    }
    @Test(dependsOnMethods = {"searchformac"})
    void searchasus(){
        Log4g.startcase("searchasus");

        home=new HomePage(driver);
        search= home.search(prop.getProperty("product2"));
        product= search.clicktoproductpage();
     com=   product.compareclick();
     com.getmessage();
     com.click();
        Assert.assertEquals(com.getmessageafterclear(),"You have no items to compare.");
        Log4g.endcase("searchasus");

    }
}
