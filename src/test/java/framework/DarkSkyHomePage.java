package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DarkSkyHomePage extends BasePage {

	//Locators
	private By todaysBar = By.className("bar");
	private By timeMachineButton = By.id("timeMachine");
	private By dayOfWeek = By.className("name");
	private By day = By.className("day");
	private By dayRevealed = By.linkText("day revealed");
	private By minTemp = By.className("minTemp");
	private By maxTemp = By.className("maxTemp");
	private By timeMachineCalendar = By.className("calendar");
	private By selectedDateInHeader = By.className("date");

	//Methods
	public void clickOnTodaysBar() {
		clickOn(todaysBar);
	}

	public void clickOnTimeMachineButton() {
		clickOn(timeMachineButton);
	}

	public By getMinTemp(){
		System.out.println("Min Temp = " + minTemp);
		return minTemp;
	}
	public By getMaxTemp(){
		System.out.println("Max Temp = " + maxTemp);
		return maxTemp;
	}

	public List getDaysOfWeek() {
		//now create a list of all the days on darksky
		//there should be exactly 8 WebElements
		List<WebElement> days = SharedSD.getDriver().findElements(dayOfWeek);

		return days;
	}

	public int getWeekdayNumber() {
		//start by getting what the day of the week is for today - this returns an int
		Calendar now = Calendar.getInstance();
		System.out.println("Todays day of the week is : " + (now.get(Calendar.DAY_OF_WEEK)));
		int weekdayNumber = (now.get(Calendar.DAY_OF_WEEK));

		return weekdayNumber;
	}

	public String getWeekdayWord(int weekdayNumber) {
		System.out.println("Inside getWeekdayWord function)");
		String weekdayWord = " ";
		switch (weekdayNumber) {
			case 1:
				weekdayWord =  "Mon";
				System.out.println("weekdayWord is Mon");
				break;
			case 2:
				weekdayWord = "Tue";
				System.out.println("weekdayWord is Tue");
				break;
			case 3:
				weekdayWord = "Wed";
				System.out.println("weekdayWord is Wed");
				break;
			case 4:
				weekdayWord = "Thu";
				System.out.println("weekdayWord is Thu");
				break;
			case 5:
				weekdayWord = "Fri";
				System.out.println("weekdayWord is Fri");
				break;
			case 6:
				weekdayWord = "Sat";
				System.out.println("weekdayWord is Sat");
				break;
			case 7:
				weekdayWord = "Sun";
				System.out.println("weekdayWord is Sun");
				break;
			default:
				weekdayWord = "calendarDay is not a value 1 thru 7";
				break;
		}
		return weekdayWord;
	}

	public void selectTimeMachineDate() throws Exception {
		String tomorrow = BasePage.getFutureDate(1, "d");
		System.out.println("In selectTimeMachineDate method and tomorrow is equal to: " +tomorrow);
		selectValueFromCalendar(timeMachineCalendar, tomorrow);
	}

	public boolean isDateClickable() {
		boolean displayed = BasePage.isLocatorDisplayed(timeMachineCalendar);
		boolean enabled = BasePage.isLocatorEnabled(timeMachineCalendar);
		// assumption: date is clickable if it is displayed and enabled
		if (displayed && enabled) {return true;}
		else return false;
	}

	public boolean isHeaderDateFormattedCorrectly() {
		//date needs to be in this format: Thursday, Mar 15th, 2018
		//calculate what tomorrow's date should look like

		String tomorrow = BasePage.getFutureDate(1,"EEE, MMM d, yyyy");

		//compare what we know it should like to what it actually looks like
		if (tomorrow.equals(selectedDateInHeader)) {
			return true;
		} else
			return false;

	}
}
