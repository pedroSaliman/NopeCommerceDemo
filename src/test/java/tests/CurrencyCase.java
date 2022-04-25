package tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class CurrencyCase extends Base{
    HomePage home;
    @Test
    void currency(){
        Log4g.startcase("currency");

        home = new HomePage(driver);
        home.select();
        Log4g.endcase("currency");

    }
}
