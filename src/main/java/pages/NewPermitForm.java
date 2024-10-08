package pages;

import com.aventstack.extentreports.gherkin.model.ScenarioOutline;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewPermitForm extends Base {

    public NewPermitForm(WebDriver driver) {
        super(driver);
    }

    // locator for new visit
    // locators  location
    private final By createVisitReqBtn = By.cssSelector("a[href=\"https://vms-stg.wakeb.tech/dashboard/visits/create\"]"); //button New request
    private final By selectbutton =By.cssSelector("button[class=\"btn btn-outline-light m-0 dropdown-toggle w-100\"]");

    private final By SelectLocation = By.cssSelector("button[class=\"btn btn-outline-light m-0 dropdown-toggle w-100\"]");
    private final By plusIcon = By.cssSelector("li[id=\"5\"] >i");     // + for open the location
    private final By firstOption = By.cssSelector("li[id=\"5\"]  a[id=\"5_anchor\"]");  // locatio
    private final By secondOption = By.cssSelector("li[id=\"5\"]  a[id=\"6_anchor\"]"); // sub location
    private final By selectManagement = By.cssSelector("select[name=\"department_id\"]");   // the management
    private final By visitTypeId = By.cssSelector("select[class=\"nice-select form-control visit_type select2-hidden-accessible\"]"); // typ visit
    private final By GoalOfVisit = By.cssSelector("input[name=\"description\"]");  //الهدف
    private final By VisitDays = By.cssSelector("select[name=\"repeat\"]"); // ايام الزيارة
    private final By FromDate = By.id("from_date");    //تاريخ البداء
    private final By FromTime = By.cssSelector("input[id=\"from_fromtime\"]");   //وقت البدء
    private final By ToDate = By.id("to_date");     // تاريخ الانتهاء *
    private final By ToTime = By.id("to_totime");   // وقت الانتهاء
    private final By Comment = By.name("comment"); // كومنت
    //    private final By radio_button =By.id("choosefromemployee");             //radio button
    private final By radio_button = By.cssSelector("#visitForm > div.card-body > div > div > div:nth-child(3) > div:nth-child(3) > div > label > b");           //radio button
    private final By ButtonAddVisitor = By.id("AddVisitor");  // زر اضافة زائر


    //  complete page of visit (the second page)

    private final By searchBar = By.cssSelector("span[class=\"select2-selection select2-selection--multiple\"]");
    private final By user = By.cssSelector("select[id=\"selectUsers\"]");
    private final By saveuser = By.cssSelector("a[id=\"saveVisitors\"]");

    // locate button to complete the visit request
    private final By ButtonSaveRequest = By.id("submitVisitForm");




    // function location
    public void ChooseLocation() {
        click(createVisitReqBtn);
        click(selectbutton);
        click(SelectLocation);
        click(plusIcon);
        click(firstOption);
        click(secondOption);
    }

    public void InfoOfVisit(String message) {
        selectByIndex(selectManagement, 0);
        selectByIndex(visitTypeId, 0);
        setTextElement(driver.findElement(GoalOfVisit), message);
        selectByIndex(VisitDays, 1);
    }

    public void Working_hours(String time, String time2, String starttime, String Endtime) {
        setTextElement(driver.findElement(FromDate), time);
        setTextElement(driver.findElement(ToDate), time2);
        setTextElement(driver.findElement(FromTime), starttime);
        setTextElement(driver.findElement(ToTime), Endtime);
    }

    public void MoreInfo(String comment) {
        setTextElement(driver.findElement(Comment), comment);
        click(radio_button);
        click(ButtonAddVisitor);
    }


    public void Selectvisitor() {
        click(searchBar);
        selectByIndex(user, 0);
        click(saveuser);
    }

    public void completeVisitRequest()
    {
     click(ButtonSaveRequest);
    }

//    public void selectRadioButtonIfNotSelected() {
//        try {
//            // Check if the radio button is selected by interacting with the locator
//            if (!driver.findElement(radio_button).isSelected()) {
//                // Wait for 60 milliseconds
//                Thread.sleep(60);
//
//                // After waiting, check again and click if still not selected
//                if (!driver.findElement(radio_button).isSelected()) {
//                    click(radio_button); // Use your custom click method from the Base class
//                }
//            }
//        } catch (InterruptedException e) {
//            // Handle the InterruptedException in case the thread is interrupted
//            e.printStackTrace();
//            Thread.currentThread().interrupt(); // Restore the interrupted status
//        }
//    }




//
//    public void selectRadioButtonIfNotSelected() {
//        // Check if the radio button is selected by interacting with the locator
//        if (!driver.findElement(radio_button).isSelected()) {
//            click(radio_button); // Use your custom click method from the Base class
//        }else {
//            System.out.println("the button is already selected ");
//        }
//
//    }


}
