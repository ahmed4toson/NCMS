package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewVisitor extends Base {


    public AddNewVisitor(WebDriver driver)
    {
     super(driver);
    }
    private final By SearchBar = new By.ByCssSelector("span[class=\"select2-selection select2-selection--multiple\"]"); //بحث عن زائر

}
