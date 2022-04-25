package tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class HoverCase extends Base{
HomePage home;
@Test
    void hover(){
    Log4g.startcase("hover");

    home=new HomePage(driver);
    home.hover();
    Log4g.endcase("hover");

}








}
