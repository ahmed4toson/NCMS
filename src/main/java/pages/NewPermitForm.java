package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewPermitForm extends Base {

     public NewPermitForm(WebDriver driver)
    {
        super(driver);
    }



    private final By createVisitReqBtn = By.cssSelector("a[href=\"https://vms-stg.wakeb.tech/dashboard/visits/create\"]");
    private final By SelectLocation = By.cssSelector("button[class=\"btn btn-outline-light m-0 dropdown-toggle w-100\"]");
    private final By plusIcon =By.cssSelector("li[id=\"10\"] > i");
    private final By firstOption = By.cssSelector("li[id=\"10\"] a[id=\"10_anchor\"]");
    private final By secondOption =By.cssSelector("li[id=\"10\"]  a[id=\"11_anchor\"]");
    private final By selectManagement = By.cssSelector("select[name=\"department_id\"]");
    private final By visitTypeId   = By.cssSelector("select[class=\"nice-select form-control visit_type select2-hidden-accessible\"]");
    private final By GoalOfVisit = By.cssSelector("input[name=\"description\"]");
    private final By VisitDays = By.cssSelector("select[name=\"repeat\"]"); // ايام الزيارة
    private final By FromDate =  By.id("from_date");    //تبداء من
    private final By FromTime =By.id("from_fromtime");   //بداية الوقت
    private final By ToDate = By.id("from_dat");    // حتي يوم
    private final By ToTime = By.id("to_totime"); // نهاية الوقت
    private final By Comment = By.name("comment"); // كومنت
    private final By ButtonAddVisitor = By.id("AddVisitor"); // زر اضافة زائر
    private final By ButtonSaveRequest = By.id("submitVisitForm");


    public void ChooseLocation ()
    {
        click(createVisitReqBtn);
        click(SelectLocation);
        click (plusIcon);
        click (firstOption);
        click(secondOption);
    }

    public void InfoOfVisit()
    {

        selectByIndex(selectManagement ,1);
    }








}
