package tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class ContactUsPage extends Base{
    HomePage home;
    Pages.ContactUsPage contact;
    @Test
    void contact(){
        Log4g.startcase("contact");
        home=new HomePage(driver);
      contact=  home.contact();
      contact.sendinformation();
        Log4g.endcase("contact");

    }
}
