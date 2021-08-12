package com.premierinn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmendDetailsPage {

    @FindBy(xpath = "//h1[.='Amend your booking']")
    public WebElement amendYourBooking;

    @FindBy(xpath = "//td[.=\"25\"]")
    public WebElement newDate;

    @FindBy(id = "arrivalDate")
    public WebElement arrivalDate;

    @FindBy(xpath = "//div[contains(@data-ng-if,'availability')]")
    public WebElement captureSection;
}
