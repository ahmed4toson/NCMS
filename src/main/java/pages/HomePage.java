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
    private final By visitPermit =new By.ByCssSelector("a[href=\"https://vms-stg.wakeb.tech/ar/dashboard/visits\"]");



public void goToVisitPermit()
{
    hover(Permits);
    click(visitPermit);

}

}
