package com.krafttechexlab.pages;

import com.krafttechexlab.utilities.BrowserUtils;
import com.krafttechexlab.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
    @FindBy(xpath = "//li[@class='breadcrumb-item'][2]")
    public WebElement dashboardElement;

    @FindBy(xpath = "//h5[text()='About']")
    public WebElement about;

    @FindBy(xpath = "//i[@class='bi bi-trash text-danger f-16']")
    public WebElement deleteEducationButton;

    public void profileTabs(String tab){
        String locator = "//button[text()='"+tab+"']";
        Driver.get().findElement(By.xpath(locator)).click();

    }

    public WebElement educationExist(String schoolName){
        String locator = "//span[text()='"+schoolName+"']";
        return Driver.get().findElement(By.xpath(locator));
    }

    public void deleteEducation(){
        String locator = "//i[@class='bi bi-trash text-danger f-16']";
        BrowserUtils.clickWithJS(deleteEducationButton);

        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
    }

}
