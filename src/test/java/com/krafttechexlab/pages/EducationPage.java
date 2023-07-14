package com.krafttechexlab.pages;

import com.krafttechexlab.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EducationPage extends BasePage{
    @FindBy(id = "school")
    public WebElement schoolOrBootCampInput;

    @FindBy(id = "degree")
    public WebElement degreeInput;

    @FindBy(id = "study")
    public WebElement studyInput;

    @FindBy(id = "fromdate")
    public WebElement fromDateInput;

    @FindBy(id = "todate")
    public WebElement toDateInput;

    @FindBy(xpath = "(//textarea[@id='description'])[2]")
    public WebElement programDescriptionInput;

    @FindBy(xpath = "//button[@value='education']")
    public WebElement addEducationButton;


    public void fillEducationInputBoxes(String school, String degree, String study, String fromDate, String toDate, String description) {
        Driver.get().findElement(By.id("school")).sendKeys(school);
        Driver.get().findElement(By.id("degree")).sendKeys(degree);
        Driver.get().findElement(By.id("study")).sendKeys(study);
        Driver.get().findElement(By.xpath("(//div[@class='col-md-8 col-lg-9']/input[@name='fromdate'])[2]")).sendKeys(fromDate);
        Driver.get().findElement(By.xpath("(//div[@class='col-md-8 col-lg-9']/input[@name='todate'])[2]")).sendKeys(toDate);
        Driver.get().findElement(By.xpath("(//div[@class='col-md-8 col-lg-9']/textarea[@id='description'])[2]")).sendKeys(description);
        Driver.get().findElement(By.xpath("//button[@value='education']")).click();
    }

}
