package com.premierinn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "booking-reference-input" )
    public WebElement BookingReference;

    @FindBy(id="booking-surname-input")
    public WebElement surnamefield;

    @FindBy(xpath = "//div[.=\"Arrival date *\"]")
    public WebElement datePicker;

    @FindBy(xpath = "//button[@id='date-picker-day-2182021']")
    public WebElement selectedDate;

    @FindBy(id = "find-booking-form-button")
    public WebElement searchButton;

}
