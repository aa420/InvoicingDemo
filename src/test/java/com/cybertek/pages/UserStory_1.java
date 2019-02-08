package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory_1 {


    public UserStory_1() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public WebElement searchMagnificationBtn;

    @FindBy(xpath = "//body[@class='o_web_client']/div[@class='o_main']/div[@class='o_main_content']/div[@class='o_control_panel']/div[@class='o_cp_right']/div[@class='btn-group o_search_options']/div[1]/button[1]")
    public WebElement filterBtn;

    @FindBy(xpath = "//span[contains(text(),'Customer Invoices')]")
    public WebElement customer_Invoices_btn;

    @FindBy(xpath = "//li[@data-index='0']//a[@href='#'][contains(text(),'Draft')]")
    public WebElement draft_btn;

    @FindBy(xpath = "//a[contains(text(),'Open')]")
    public WebElement open_btn;

    public String verifyStatus(int row) {

        String xpth = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody/tr[" + row + "]/td[10]";

        return xpth;
    }


}
