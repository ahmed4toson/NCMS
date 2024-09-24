package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase{

    private LoginPage loginpage;
    private HomePage homepage ;


    @Test
    public void loginCredential()throws InterruptedException{
    logger = extent.createTest("Log in with valid data");

    loginpage =new LoginPage(driver);
    loginpage.FormLogin("default@wakeb.com","P@ssw0rd");

    reporter("pass","Toson");
}


@Test
    public void navigatepermitspage ()
{
    homepage =new HomePage(driver);

}
}
