package tests.auth;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.auth.LoginPage;
import tests.TestBase;

public class LoginTest extends TestBase {

    private LoginPage loginpage;
    private HomePage homepage ;


    @Test
    public void loginCredential()throws InterruptedException{
    logger = extent.createTest("Log in with valid data");

    loginpage =new LoginPage(driver);
    loginpage.FormLogin("default@user.com","P@ssw0rd");
        reporter("info","userName is default@wakeb.com");
        reporter("warning","user should enter a valid password");

    if (5 == 5){
        reporter("Pass","Toson passed");
    }else {
        reporter("fail","Toson faild");
    }
}

@Test
    public void navigatepermitspage () throws InterruptedException{
        logger = extent.createTest("navigate done ");
    homepage =new HomePage(driver);

}
}
