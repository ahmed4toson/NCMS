package tests;

import org.testng.annotations.Test;
import pages.*;
import pages.auth.LoginPage;
import pages.auth.LogoutPage;

public class CreateRequestVisitTest extends TestBase {

     NewPermitForm form ;
    LoginPage loginpage;
    HomePage homePage;

    LogoutPage logout ;
     @Test
    public void form() throws InterruptedException {
         logger =extent.createTest("user can  Login successfully");


         loginpage =new LoginPage(driver);
         loginpage.FormLogin("default@user.com","P@ssw0rd");

         logger =extent.createTest("Navigate successfully to Visit requests ");
         homePage = new HomePage(driver);
         homePage.goToVisitPermit();


         form = new NewPermitForm(driver);
         logger =extent.createTest("choose location successfully");
         form.ChooseLocation();

         logger = extent.createTest("correct successfully ");
         form.InfoOfVisit("welcome at wakeb");

         logger = extent.createTest("duration visit available ");
         form.Working_hours("9292024","9302024" ,"0700a","0500p");

         logger =extent.createTest("more info are correct ");
         form.MoreInfo("welcome at wakeb ai");

         logger =extent.createTest("select user valid ");
         form.Selectvisitor();

         logger =extent.createTest("finished by create new visit request");
         form.completeVisitRequest();


         logout = new LogoutPage(driver);
         logout.Logoutfunction();







//      form.selectRadioButtonIfNotSelected();

//        reporter("info", "the button is already selected ");

     }

}
