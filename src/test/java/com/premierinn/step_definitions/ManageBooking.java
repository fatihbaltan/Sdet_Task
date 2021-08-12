package com.premierinn.step_definitions;

import com.premierinn.pages.AmendDetailsPage;
import com.premierinn.pages.DashboardPage;
import com.premierinn.pages.HomePage;
import com.premierinn.utilities.ConfigurationReader;
import com.premierinn.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

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
        HomePage homePage = new HomePage();
        homePage.searchButton.click();
        DashboardPage dashboardPage = new DashboardPage();
        /*String actualinfo = dashboardPage.bookingInfo.getText();
        System.out.println("actualinfo = " + actualinfo);*/
        Assert.assertEquals("Booking information", dashboardPage.bookingInfo.getText());
    }

    @When("the user click in the Amend booking")
    public void the_user_click_in_the_Amend_booking() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.amendBooking.click();
    }

    @Then("the user in the Amend booking page")
    public void the_user_in_the_Amend_booking_page() {
        AmendDetailsPage amendDetailsPage = new AmendDetailsPage();
        Assert.assertEquals("Amend your booking",amendDetailsPage.amendYourBooking.getText());
    }

    @Then("the user change the arrival date to {int} August")
    public void the_user_change_the_arrival_date_to_August(Integer int1) {
        AmendDetailsPage amendDetailsPage = new AmendDetailsPage();
        amendDetailsPage.arrivalDate.click();
        amendDetailsPage.newDate.click();

        String  src = amendDetailsPage.captureSection.getText();
        System.out.println("src = " + src);
    }

}
