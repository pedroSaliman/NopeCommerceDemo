package tests;

import Pages.HomePage;
import Pages.MyProductPage;
import Pages.SearchPage;
import Pages.WishlistPage;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Search extends Base {
    HomePage home;
    SearchPage search;
   WishlistPage wish;
    MyProductPage product;
    @Test
    void search(){
        home=new HomePage(driver);
     search= home.search(prop.getProperty("product1"));
   product= search.clicktoproductpage();


    }
}
