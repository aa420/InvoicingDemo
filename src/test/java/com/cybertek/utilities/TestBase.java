package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected SoftAssert softAssert;


    @BeforeMethod
    public void setUpMethod() {

        driver = Driver.getDriver(); //using this no one can create object
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
        actions = new Actions(driver);
        softAssert = new SoftAssert();

        Constance.loginToInvoicingModule();

    }

    @AfterMethod
    public void tearDownMethod() {

        Driver.closeDriver();
        softAssert.assertAll();

    }

}
