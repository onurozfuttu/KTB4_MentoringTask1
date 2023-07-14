package com.krafttechnologie.pages;

import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserProfilePage extends BasePage{
    public void navigateToOverviewMenu(String tab){
        WebElement tabElement= Driver.get().findElement(By.xpath("//li/button[.='"+tab+"']"));
        tabElement.click();
    }


}
