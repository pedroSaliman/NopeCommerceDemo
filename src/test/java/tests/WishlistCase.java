package tests;

import Pages.HomePage;
import Pages.MyProductPage;
import Pages.SearchPage;
import Pages.WishlistPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishlistCase extends  Base{
    HomePage home;
    SearchPage search;
    WishlistPage wish;
    MyProductPage product;
    @Test
    void wishlist(){
        Log4g.startcase("wishlist");

        home=new HomePage(driver);
        search= home.search(prop.getProperty("product1"));
        product= search.clicktoproductpage();
        wish=  product.wish();
        wish.wishlist();
        Assert.assertEquals(wish.getmessage(), "The wishlist is empty!");
        Log4g.endcase("wishlist");



    }
}
