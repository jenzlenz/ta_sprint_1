package framework;

import org.apache.velocity.runtime.directive.Parse;
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
	private By dayOfWeek = By.className("name");
	private By day = By.className("day");
	private By dayRevealed = By.linkText("day revealed");
	private By minTemp = By.className("minTemp");
	private By maxTemp = By.className("maxTemp");
	private By timeMachineButton = By.xpath(".//*[@id=\"timeMachine\"]/div[2]/a");
	private By timeMachineCalendar = By.xpath(".//*[@class=\"pika-lendar\"]/descendant::td");
	private By selectedDateInHeader = By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div");

	//Methods
	public void clickOnTodaysBar() {
		clickOn(todaysBar);
	}

	public void clickOnTimeMachineButton() {
		clickOn(timeMachineButton);
	}

	public boolean isTempLowToHigh(){
		List<WebElement> minTemps = SharedSD.getDriver().findElements(minTemp);
		List<WebElement> maxTemps = SharedSD.getDriver().findElements(maxTemp);
		for (int i = 0; i < minTemps.size(); i++) {
			//get the webelement text and convert to int, then remove degree symbol to be able to compare
			//code written to accomodate single and double digit temps
			int lowTempInt = Integer.parseInt(minTemps.get(i).getText().substring(0, (minTemps.get(i).getText().length() - 1)));
			int highTempInt = Integer.parseInt(maxTemps.get(i).getText().substring(0,(maxTemps.get(i).getText().length() - 1)));

			if (lowTempInt > highTempInt) {
				return false;
			}
		}
		return true;
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
		Thread.sleep(3000);
		selectValueFromCalendar(timeMachineCalendar, tomorrow);
		Thread.sleep(3000);
	}

	public boolean isDateClickable() {
		//is clickable means it has an href attribute
		String selectedDateLink = SharedSD.getDriver().findElement(selectedDateInHeader).getAttribute("href");
		try {
			if (selectedDateLink.equals(null)) {
				return false;
			} else {
				return true;
			}
		} catch (NullPointerException e) {
			return false;
		}
	}

	public boolean isHeaderDateFormattedCorrectly() {
		//date needs to be in this format: Thursday, Mar 15th, 2018
		//first find the day and identify the suffix st/nd/rd/th

		String tomorrowDayAsString = BasePage.getFutureDate(1,"d");
		int tomorrowDayAsInt = Integer.parseInt(tomorrowDayAsString);
		String dayNumberSuffix = getDayNumberSuffix(tomorrowDayAsInt);

		String tomorrowPart1 = BasePage.getFutureDate(1, "EEEEE, MMM d");
		String tomorrowPart2 = BasePage.getFutureDate(1, "YYYY");

		String tomorrowShouldBe = tomorrowPart1 + dayNumberSuffix + ", " + tomorrowPart2;

		String websiteShowsTomorrowAs = SharedSD.getDriver().findElement(selectedDateInHeader).getText();

		//compare what we know it should like to what it actually looks like
		if (tomorrowShouldBe.equals(websiteShowsTomorrowAs)) {
			return true;
		} else {
			return false;
		}
	}

	private String getDayNumberSuffix(int day) {
		if (day >= 11 && day <= 13) {
			return "th";
		}
		switch (day % 10) {
			case 1:
				return "st";
			case 2:
				return "nd";
			case 3:
				return "rd";
			default:
				return "th";
		}
	}
}
