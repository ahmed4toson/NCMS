package pages.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Base;

public class LogoutPage extends Base {

    public LogoutPage(WebDriver driver)
    {
        super(driver);
    }

    private final By NameUser = By.cssSelector("span[class=\"text-dark-50 font-weight-bolder font-size-base d-none d-md-inline mr-3\"]");

    private final By LogoutButton =By.cssSelector("span[class=\"btn btn-light-primary font-weight-bold\"]");



    public void Logoutfunction()
    {
        click(NameUser);
        click(LogoutButton);

    }


}
