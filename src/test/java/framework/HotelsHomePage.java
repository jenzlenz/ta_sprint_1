package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HotelsHomePage;
import org.testng.Assert;
import org.openqa.selenium.By;
import stepdefinition.SharedSD;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class HotelsHomePage extends BasePage{

//Locators
    private By destinationTextField = By.id("qf-0q-destination");
    private By destinationguesses = By.className("autosuggest-category-result");
    private By checkInDateTextBox = By.xpath(".//*[@id=\"qf-0q-localised-check-in\"]");
    private By checkInDatePicker = By.xpath(".//*[@class=\"widget-datepicker-bd\"]/descendant::a/");
    private By checkOutDatePicker = By.xpath(".//*[@class=\"widget-datepicker-bd\"]/descendant::a/");
    private By checkOutDateTextBox = By.xpath(".//*[@id=\"qf-0q-localised-check-out\"]");
    private By numRoomsDropdown = By.id("qf-0q-rooms");
    private By roomsDropdown = By.id("qf-0q-compact-occupancy");
    private By numAdultsDropdown = By.id("qf-0q-room-0-adults");
    private By numChildrenDropdown = By.id("qf-0q-room-0-children");
    private By searchButton = By.xpath("//*[@id=\"main-content\"]/main/div[2]/div/div[1]/div/div[1]/div[1]/div/div/form/div[5]/button");
    private By ageOfChild1Dropdown = By.id("qf-0q-room-0-child-0-age");
    private By ageOfChild2Dropdown = By.id("qf-0q-room-0-child-1-age");
    private By closeAlertButton = By.xpath(".//*[@id=\"managed-overlay\"]/button");
    private By numNights = By.className("widget-query-num-nights");
    private By editOrAddRooms = By.linkText("Edit or add Rooms");
    private By searchResultSummary = By.className("summary");

//Methods
    public void clickOnSearchButton() {
    clickOn(searchButton);
}

    public void clickOnEditOrAddRooms() {
        clickOn(editOrAddRooms);
    }

    public void chooseRooms() {
        selectFromDropdown(roomsDropdown, 2);
    }

    public void dismissInitialPopup() {
        if (isLocatorDisplayed(closeAlertButton))
            clickOn(closeAlertButton);
    }

    public void chooseDestination(String desiredDestination, String precisePlace) throws InterruptedException {
        System.out.println("desired destination is: " + desiredDestination);
        System.out.println("precisePlace is: " + precisePlace);
        Thread.sleep(3000);
        sendText(destinationTextField, desiredDestination);
        System.out.println("right before handle auto complete");
        handleAutoComplete(destinationguesses, "Milwaukee, Milwuakee County, United States of America");
        System.out.println("right after handle auto complete");
    }

    public void selectCheckInDate() throws Exception {
        clickOn(checkInDateTextBox);
        String tomorrow = BasePage.getFutureDate(1, "d");
        System.out.println("Im in selectCheckInDate method and tomorrow is equal to: " +tomorrow);
        selectValueFromCalendar(checkInDatePicker, tomorrow);
        System.out.println("Leaving checkInDate method");
    }

    public void selectCheckOutDate() throws Exception {
        clickOn(checkOutDateTextBox);
        String sixDaysLater = BasePage.getFutureDate(6, "d");
        System.out.println("Im in selectCheckOutDate method and sixDaysLater is equal to: " + sixDaysLater);
        selectValueFromCalendar(checkOutDatePicker, sixDaysLater);
        System.out.println("Leaving checkOutDate method");
    }

    public String getNumNights() {
        String calculatedNumNights = SharedSD. getDriver().findElement(numNights).getText() ;
        return calculatedNumNights;
    }

    public void selectNumRooms(int numRooms) {
        selectFromDropdown(numRoomsDropdown,numRooms);
    }

    public void selectNumAdults(int numAdults) {
        selectFromDropdown(numAdultsDropdown, numAdults);
    }

    public void selectNumChildren(int numChildren) {
        selectFromDropdown(numChildrenDropdown, numChildren);
    }

    public void selectChild1Age(int ageOfChild) {
        selectFromDropdown(ageOfChild1Dropdown, ageOfChild);
    }

    public void selectChild2Age(int ageOfChild) {
        selectFromDropdown(ageOfChild2Dropdown, ageOfChild);
    }

    public String getSearchResultHeading() {
        String searchResultHeading = SharedSD. getDriver().findElement(searchResultSummary).getText() ;
        return searchResultHeading;
    }

}
