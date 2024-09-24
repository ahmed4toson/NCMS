package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Base{

    public HomePage(WebDriver driver) {
        super(driver);
    }


    private final By Permits =new By.ByCssSelector("a.menu-link.menu-toggle");


public void handhover ()
{
    WebElement element = driver.findElement(Permits);      //  handhover
    Actions actions = new Actions(driver);
    actions.moveToElement(element);




}

}
