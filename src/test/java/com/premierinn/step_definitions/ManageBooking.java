package com.premierinn.step_definitions;

import com.premierinn.pages.HomePage;
import com.premierinn.utilities.ConfigurationReader;
import com.premierinn.utilities.Driver;
import io.cucumber.java.en.*;

public class ManageBooking {

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        HomePage homePage = new HomePage();
        homePage.acceptAllCookies.click();
        homePage.Menu.click();
    }

    @Given("the user click on the manage booking")
    public void the_user_click_on_the_manage_booking() {
        HomePage homePage = new HomePage();
        homePage.ManageBooking.click();
    }

    @Given("the user enter the {string} and {string} and pick the date")
    public void the_user_enter_the_and_and_pick_the_date(String bookingRef, String surname) {
        HomePage homePage = new HomePage();
        homePage.BookingReference.sendKeys(bookingRef);
        homePage.surnamefield.sendKeys(surname);
        homePage.datePicker.click();
        homePage.selectedDate.click();

    }

    @When("the user click on the search user should be in the booking information page")
    public void the_user_click_on_the_search_user_should_be_in_the_booking_information_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click in the Amend booking")
    public void the_user_click_in_the_Amend_booking() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user in the Amend booking page")
    public void the_user_in_the_Amend_booking_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user change the arrival date to {int} August")
    public void the_user_change_the_arrival_date_to_August(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
