package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import stepdefinition.SharedSD;

public class BasePage {

	public void clickOn(By locator) {
		try {
			System.out.println("Inside clickOn method in BasePage");
			SharedSD.getDriver().findElement(locator).click();
			System.out.println("Leaving clickOn method in BasePage");
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public void sendText(By locator, String text) {
		try {
			SharedSD.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public String getTextFromElement(By locator) {
		String text = null;
		try {
			text = SharedSD.getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}

		return text;
	}

	public void clickOnBrowserBackArrow() {
		SharedSD.getDriver().navigate().back();
	}

	public void clickOnBrowserForwardArrow() {
		SharedSD.getDriver().navigate().forward();
	}

	public void refreshBrowser() {
		SharedSD.getDriver().navigate().refresh();
	}

	public void mouseOver(By hoverOnThis, By whileHoveringClickOnThis) throws InterruptedException {
		WebElement element = SharedSD.getDriver().findElement(hoverOnThis);
		Actions action = new Actions(SharedSD.getDriver());
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		SharedSD.getDriver().findElement(whileHoveringClickOnThis).click();
		Thread.sleep(2000);
	}

	//Overloaded selectFromDropdown methods
	public void selectFromDropdown(By locator, int index) {
		//select from a dropdown by numeric index value
		Select dropdown = new Select(SharedSD.getDriver().findElement(locator));
		clickOn(locator);
		dropdown.selectByIndex(index);
	}
	public void selectFromDropdown(By locator, String textValue)  {
		//select from a dropdown by a text value
		Select dropdown = new Select(SharedSD.getDriver().findElement(locator));
		clickOn(locator);
		dropdown.selectByValue(textValue);
	}

	public static boolean isLocatorDisplayed(By locator) {
		try {
			return SharedSD.getDriver().findElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("Screenshot taken.");
			Assert.fail("element is not found with this locator" +locator.toString());
		}

		return false;
	}

	public static boolean isLocatorEnabled(By locator) {
		try {
			return SharedSD.getDriver().findElement(locator).isEnabled();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("Screenshot taken.");
			Assert.fail("element is not found with this locator" +locator.toString());
		}

		return false;
	}

	public static boolean isLocatorSelected(By locator) {
		try {
			return SharedSD.getDriver().findElement(locator).isSelected();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("Screenshot taken.");
			Assert.fail("element is not found with this locator" +locator.toString());
		}

		return false;
	}

//	public void handleAutoComplete(By locator, String inputValue, By locator2, By optionToSelect) throws InterruptedException {
//		sendText(locator, inputValue);
//
//		List<WebElement> list = SharedSD.getDriver().findElements(locator2);
//		for (WebElement ele : list) {
//			System.out.println(" ");
//			System.out.println("ele.getText() equals: " + ele.getText());
//			System.out.println("optionToSelect is: " + optionToSelect);
//			if(ele.getText().equals(optionToSelect)) {
//				System.out.println("i should be clicking on it");
//				Thread.sleep(4000);
//				ele.click();
//				break;
//			}
//		}
//	}

//	public void selectAutoCompleteByText(By locator, String stringOne) {
//		try {
//			List<WebElement> list = SharedSD.getDriver().findElements(locator);
//
//			for (WebElement elements : list) {
//
//				if (elements.getText().equals(stringOne)) {
//					Thread.sleep(4000);
//					elements.click();
//					break;
//				}
//			}
//		} catch (NoSuchElementException e) {
//			Assert.fail("Element is not found with this locator: " + locator.toString());
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (StaleElementReferenceException e) {
//			e.printStackTrace();
//		}
//	}

	public void handleAutoComplete(By locator2, String optionToSelect) throws InterruptedException {
			try {
				System.out.println("Im inside handleAutoComplete");
				List<WebElement> list = SharedSD.getDriver().findElements(locator2);
				System.out.println("I just got the list");
				for (WebElement ele : list) {
					if(ele.getText().contains("Milwuakee County, United States of America")) {
						ele.click();
						System.out.println("should click");
						Thread.sleep(4000);

						break;
					} else {
						System.out.println("these are not equal");
						System.out.println("ele.getText() equals: " + ele.getText());
						System.out.println("optionToSelect is: " + optionToSelect);
					}
				}

			} catch(StaleElementReferenceException e){
			} catch (NoSuchElementException e) {
				Assert.fail("Element is not found with this locator: " + locator2.toString());
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	public void acceptAlert() {
		SharedSD.getDriver().switchTo().alert().accept();
	}

	public void dismissAlert() {
		SharedSD.getDriver().switchTo().alert().dismiss();
	}

	public void getTextFromAlert() {
		SharedSD.getDriver().switchTo().alert().getText();
	}

	public void sendKeysToAlert() {
		// SharedSD.getDriver().switchTo().alert().sendKeys(String someText);
	}

	public void selectValueFromCalendar(By locator, String dateToSelect) throws Exception {
		Thread.sleep(3000);
		System.out.println("Inside selectValueFromCalendar method");
		SharedSD.getDriver().findElement(locator);
		List<WebElement> days = SharedSD.getDriver().findElements(locator);
		System.out.println("Just got the list of dates on the calendar");
		Thread.sleep(3000);

		for (WebElement day : days) {
			System.out.println("Looping through dates until one equals tomorrows date");

			String calendarDay = day.getText();
			System.out.println("calendar day is: " + calendarDay);
			System.out.println("dateToSelect is: " + dateToSelect);
			if (calendarDay.equals(dateToSelect)) {
				System.out.println("I found the date I need to select");
				day.click();
				System.out.println("I just clicked on the date");
				Thread.sleep(3000);
				break;
			}
			System.out.println("I didn't find the date to seelct YET.....");
		}
	}

	public void switchFromRootToNewWindow(int index) {
		List<String> listOfWindows = new ArrayList<String>(SharedSD.getDriver().getWindowHandles());
		SharedSD.getDriver().switchTo().window(listOfWindows.get(index));
	}

	public void switchBackToRootWindow() {
		List<String> listOfWindows = new ArrayList<String>(SharedSD.getDriver().getWindowHandles());

		for(int i = 1; i < listOfWindows.size(); i++){
			SharedSD.getDriver().switchTo().window(listOfWindows.get(i));
			SharedSD.getDriver().close();
		}
		SharedSD.getDriver().switchTo().window(listOfWindows.get(0));

	}

	public static String getFutureDate(int daysToAdd, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date today = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(today);
		c.add(Calendar.DATE, 1);
		Date tomorrow = new Date();
		tomorrow = c.getTime();
		String futureDate = sdf.format(tomorrow);
		System.out.println("Tomorrow's date should be: " + futureDate);

		return futureDate;
	}
}
