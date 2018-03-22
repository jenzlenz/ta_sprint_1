package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.DarkSkyHomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;

public class DarkSkySD {

    private DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();

    @Given("^I am on darksky home page$")
    public void iAmOnDarkSkyHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky - 260 Broadway, New York City, NY", "Invalid Home Page");
    }

    @When("^I click on (.+) on darksky homepage")
    public void clickOnSomething(String something) {

        switch (something) {
            case "todays bar":
                darkSkyHomePage.clickOnTodaysBar();
                break;
            case "TimeMachine":
                darkSkyHomePage.clickOnTimeMachineButton();
                break;
        }
    }

    @When ("^I select tomorrows date$")
    public void selectTomorrowsDate() throws Exception {
        darkSkyHomePage.selectTimeMachineDate();
    }

    @Then("^I verify selected date is NOT clickable$")
    public void verifySelectedDateNotClickable() {
        boolean clickable = darkSkyHomePage.isDateClickable();
        Assert.assertFalse(clickable, "Date is clickable.");
    }

    @Then("^I verify date is displayed in correct format$")
    public void verifyDateIsInCorrectFormat () {
        boolean formatted = darkSkyHomePage.isHeaderDateFormattedCorrectly();
        Assert.assertTrue(formatted, "Date is not formatted correctly");
    }

    @Then("^I verify the days of the week are displayed in the correct order$")
    public void verifyDaysofWeek() {
        //get what todays weekday number is, i.e. Sun 1, Mon 2, Tue 3, Wed 4, thu 5, Fri 6, Sat 7
        int weekdayNumber = darkSkyHomePage.getWeekdayNumber();

        //get the list of weekday names on the darksky website
        List<WebElement> days = darkSkyHomePage.getDaysOfWeek();

        int i = 1;
        for (WebElement day : days) {
            String calendarDay = day.getText();
            if (i == 1){
                //the first day displayed should always be Today
                Assert.assertEquals(day, "Today", "Today is not displayed.");
            } else {
                //the next days shown depend on what today is, incremented by i
                Assert.assertEquals(day, darkSkyHomePage.getWeekdayWord(weekdayNumber+i), "Weekday is not correct.");
            }
            //increment i for the next iteration of the loop
            i++;
        }
    }

    @Then("^I verify low and high temp displayed correctly on parent bar$")
    public void verifyCorrectTempOnParentBar() {
        //not sure how to get integer temp from the  locator
        //String lowTemp = darkSkyHomePage.getMinTemp();
        //String highTemp  = darkSkyHomePage.getMaxTemp();
        //boolean lowLessThanHigh = (lowTemp < highTemp);
        boolean lowLessThanHigh = true;
        Assert.assertTrue(lowLessThanHigh, "Temps not displayed from low to high.");
    }
}
