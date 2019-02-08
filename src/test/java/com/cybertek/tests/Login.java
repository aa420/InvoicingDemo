package com.cybertek.tests;

import com.cybertek.pages.loginPages.HomePage;
import com.cybertek.pages.loginPages.LogInPage;
import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @Test(alwaysRun = true)
    public void testName() {

        LogInPage logInPage = new LogInPage();
        logInPage.open();
        logInPage.login();

        HomePage homePage = new HomePage();
        homePage.invoicingBtn.click();

    }
}
