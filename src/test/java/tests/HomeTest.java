package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.auth.LoginPage;

public class HomeTest extends TestBase{
    HomePage homePage ;
    private LoginPage loginpage;

    @Test
    public void testCase1() throws InterruptedException {
        logger= extent.createTest("user should go to visit permit");
     //   logger= extent.getStats();

        loginpage =new LoginPage(driver);
        loginpage.FormLogin("default@wakeb.com","P@ssw0rd");
        reporter("info","userName is default@wakeb.com");
        reporter("warning","user should enter a valid password");

        if (5 == 5){
            reporter("Pass","Toson passed");
        }else {
            reporter("fail","Toson faild");
        }

        homePage = new HomePage(driver);
        homePage.goToVisitPermit();
        reporter("pass","passsssssss");

    }
}
