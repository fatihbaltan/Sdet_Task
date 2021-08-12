package com.premierinn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//h3[.='Booking information']")
    public WebElement bookingInfo;
}
