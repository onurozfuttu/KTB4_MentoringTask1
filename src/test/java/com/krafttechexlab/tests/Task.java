package com.krafttechexlab.tests;

import com.krafttechexlab.pages.DashboardPage;
import com.krafttechexlab.pages.EducationPage;
import com.krafttechexlab.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task extends TestBase{
    /**
     1-open chrome browser
     2-navigate to https://www.krafttechexlab.com/login by using configuration.properties
     3-login with login method
     4-Assert successful login with user name
     5-Navigate to My Profile with related method (navigate tabs and modules method)
     6-Verify that overview page is displayed
     7-Navigate to Add Education tab with related method (navigate tabs method)
     8-Verify that add education page is displayed
     9-Fill the form with parameterized login method (using actions class is optional)
     10-Verify that added education information can be seen at overview page...
     11-Delete last added education

     important note: every student should use own credentials, otherwise the test case will fail....
     */


    @Test
    public void task1() {
        extentLogger = report.createTest("Task for Kraft Batch 4 mentorship");
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        EducationPage educationPage = new EducationPage();

        extentLogger.info("login with login method");
        loginPage.login();

        extentLogger.info("Assert successful login with user name");
        Assert.assertEquals(loginPage.getUserAccountName(),"TesterBFour");

        extentLogger.info("Navigate to My Profile with related method");
        loginPage.navigateToModule("TesterBFour","My Profile");

        extentLogger.info("Verify that overview page is displayed");
        Assert.assertTrue(dashboardPage.about.isDisplayed());

        extentLogger.info("Navigate to Add Education tab with related method");
        dashboardPage.profileTabs("Add Education");
        Assert.assertTrue(educationPage.schoolOrBootCampInput.isEnabled());

        extentLogger.info("Fill the form with parameterized login method");
        educationPage.fillEducationInputBoxes("Kraft","Bootcamp",
                "QA Automation Testing","27022023",
                "27102023","Learning TestNG Selenium");


        extentLogger.info("Verify that added education information can be seen at overview page");
        Assert.assertEquals(dashboardPage.educationExist("Kraft").getText(),"Kraft");

        extentLogger.info("Delete last added education");
        dashboardPage.deleteEducation();

        extentLogger.pass("PASSED");
    }

}
