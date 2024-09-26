package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class Base {
    protected static WebDriver driver;
    private final long timeoutInSeconds = 20;
    WebDriverWait webDriverWait;
    public Base(WebDriver driver) {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        Base.driver = driver;
        PageFactory.initElements(driver, this);
    }
    protected void setTextElement(WebElement TextBox, String value) {
        TextBox.clear();
        TextBox.sendKeys(value);
    }
    protected void click_JS(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
    }
    public void hover(By locator)
    {
        WebElement element = driver.findElement(locator);      //  handhover
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.build().perform();
    }
    protected WebElement waitUntilElementToBevisible(WebElement webElement) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;
    }
    protected WebElement waitUntilElementToBevisible(By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected void waitUntilElementToBeClickable(WebElement webElement) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
    protected static WebElement waitUntilElementToBeClickable(By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(locator));
    }


    // Helper method to select an option by visible text
    private void selectByVisibleText(By locator, String text) {
        new Select(driver.findElement(locator)).selectByVisibleText(text);
    }

    // Helper method to select an option by index
    void selectByIndex (By locator, int index) {
        new Select(driver.findElement(locator)).selectByIndex(index);
    }

    private void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }









    protected static void click(WebElement webElement) {
        for (int i = 0; i < 10; i++) {
            try {
                webElement.click();
                break;
            } catch (ElementClickInterceptedException e) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }

        }
    }
    protected void click(By byLoc) {
        WebElement webElement = waitUntilElementToBeClickable(byLoc);
        for (int i = 0; i < 10; i++) {
            try {
                webElement.click();
                break;
            } catch (ElementClickInterceptedException e) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }




}
