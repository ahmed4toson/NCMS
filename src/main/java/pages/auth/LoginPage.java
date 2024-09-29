package pages.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Base;

public class LoginPage extends Base {

   // WebDriver driver;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By Email = new By.ById("email");   //email
    private final By Password = new By.ById("pwd"); //pass
    private final By ButtonLogin =new By.ByCssSelector("button.add_loading.btn.btn-primary.font-weight-bolder.font-size-h6.my-3.mr-3");


public void FormLogin(String username, String password)
{
  setTextElement(driver.findElement(Email),username);
  setTextElement(driver.findElement(Password), password);
  click(ButtonLogin);
}





}
