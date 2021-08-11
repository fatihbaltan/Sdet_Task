package com.premierinn.pages;

import com.premierinn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {
        public BasePage() {
            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(id = "pi-menu-button")
    public WebElement Menu;

        @FindBy(id = "accept-all-cookies-button" )
    public WebElement acceptAllCookies;

        @FindBy(xpath = "//my-pi-wrapper[@class = 'my-pi-wrapper']/div[2]")
    public WebElement ManageBooking;


}
