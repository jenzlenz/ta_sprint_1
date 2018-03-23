package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.BasePage;
import framework.HotelsHomePage;
import org.testng.Assert;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HotelsSD {

    private HotelsHomePage hotelsHomePage = new HotelsHomePage();

    @Given("^I am on hotels home page$")
    public void iAmOnHotelsHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Hotels.com - Cheap Hotels, Discount Rates & Hotel Deals", "Invalid Home Page");
        //hotelsHomePage.dismissInitialPopup();
    }

    @When("^I enter (.+) in destination and select (.+) on hotels.com home screen$")
    public void enterDestination(String destination, String specificPlace) throws InterruptedException {
        hotelsHomePage.chooseDestination("Milwaukee, Milwuakee County, United States of America", "Milwaukee, Milwuakee County, United States of America");
    }

    @When("^I select check in for tomorrows date$")
    public void selectCheckInTomorrow() throws Exception {
        hotelsHomePage.selectCheckInDate();
    }

    @When("^I select check out date 6 days later$")
    public void selectCheckOutSixDaysLater() throws Exception {
        hotelsHomePage.selectCheckOutDate();
    }

    @Then("^I verify the number of nights is 6$")
    public void verifyNumberOfNights() {
        String lengthOfStay = hotelsHomePage.getNumNights();
        Assert.assertEquals(lengthOfStay, "6", "Number of Nights calculated is incorrect.");
    }

    @Then("^I select Rooms$")
    public void selectRooms(){
        //hotelsHomePage.clickOnEditOrAddRooms();
        hotelsHomePage.chooseRooms();
    }

    @Then("^I select 1 room$")
    public void selectNumberOfRooms() {
        hotelsHomePage.selectNumRooms(0);
    }

    @Then("^I select 2 adults$")
    public void selectAdults(){
        hotelsHomePage.selectNumAdults(1);
    }

    @Then("^I select 2 children$")
    public void selectChildren(){
        hotelsHomePage.selectNumChildren(2);
    }

    @Then("^I select age 2 for child 1$")
    public void selectAgeOfChild1(){
        hotelsHomePage.selectChild1Age(2);
    }

    @Then("^I select age 1 for child 2$")
    public void selectAgeOfChild2(){
        hotelsHomePage.selectChild2Age(1);
    }

    @Then("^I click on Search to get hotel results$")
    public void clickSearch(){
        hotelsHomePage.clickOnSearchButton();
    }

    @Then("^I verify search results page displays correct options chosen$")
    public void verifySearchResultHeaderInfo() {
        String searchResultHeading = hotelsHomePage.getSearchResultHeading();
        String tomorrow = BasePage.getFutureDate(1, "EEE d");
        String sixDaysLater = BasePage.getFutureDate(7, "EEE d MMMMM YYYY");
        String expectedResultHeading = "Milwaukee, WI, USA " + tomorrow + " - " + sixDaysLater + ", 6 nights, 1 room, 2 adults, 2 children";
        Assert.assertEquals(searchResultHeading, expectedResultHeading, "Search Result heading is incorrect.");
    }
}