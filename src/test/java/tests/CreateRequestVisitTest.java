package tests;

import org.testng.annotations.Test;
import pages.*;

public class CreateRequestVisitTest extends TestBase {

     NewPermitForm form ;
    LoginPage loginpage;

    HomePage homePage;
     @Test
    public void form() throws InterruptedException {
         logger =extent.createTest("user can  Choose  Location");

         loginpage =new LoginPage(driver);
         loginpage.FormLogin("default@wakeb.com","P@ssw0rd");

         homePage = new HomePage(driver);
         homePage.goToVisitPermit();

         form = new NewPermitForm(driver);
         form.ChooseLocation();



     }

}
