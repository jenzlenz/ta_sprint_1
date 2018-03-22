$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotels.feature");
formatter.feature({
  "line": 2,
  "name": "Verification of Hotels homepage data",
  "description": "",
  "id": "verification-of-hotels-homepage-data",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@hotels"
    }
  ]
});
formatter.before({
  "duration": 10370204155,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on hotels home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelsSD.iAmOnHotelsHomePage()"
});
formatter.result({
  "duration": 767503402,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#  # JIRA ticket TA4:"
    }
  ],
  "line": 8,
  "name": "Verify user is able to successfully search for hotels",
  "description": "",
  "id": "verification-of-hotels-homepage-data;verify-user-is-able-to-successfully-search-for-hotels",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#    When I enter Milwaukee in destination and select Milwaukee, Milwuakee County, United States of America on hotels.com home screen"
    }
  ],
  "line": 10,
  "name": "I select check in for tomorrows date",
  "keyword": "When "
});
formatter.match({
  "location": "HotelsSD.selectCheckInTomorrow()"
});
formatter.result({
  "duration": 4215661731,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression .//*[@class\u003d\"widget-datepicker-bd\"]/descendant::a/ because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027.//*[@class\u003d\"widget-datepicker-bd\"]/descendant::a/\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d65.0.3325.181)\n  (Driver info: chromedriver\u003d2.35.528157 (4429ca2590d6988c0745c24c8858745aaaec01ef),platform\u003dMac OS X 10.13.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 26 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027Jennifers-MacBook-Pro.local\u0027, ip: \u00272604:2000:f214:4600:7563:8385:cd7c:85dc\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.3\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.35.528157 (4429ca2590d6988c0745c24c8858745aaaec01ef), userDataDir\u003d/var/folders/cx/lxsyqlj150793jhkymfzp_ym0000gn/T/.org.chromium.Chromium.hVqEDj}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d65.0.3325.181, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: edcc2e27bcfa8681771caa8bcdc91bc5\n*** Element info: {Using\u003dxpath, value\u003d.//*[@class\u003d\"widget-datepicker-bd\"]/descendant::a/}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\n\tat framework.BasePage.selectValueFromCalendar(BasePage.java:209)\n\tat framework.HotelsHomePage.selectCheckInDate(HotelsHomePage.java:72)\n\tat stepdefinition.HotelsSD.selectCheckInTomorrow(HotelsSD.java:30)\n\tat ✽.When I select check in for tomorrows date(hotels.feature:10)\n",
  "status": "failed"
});
formatter.after({
  "duration": 82763180,
  "status": "passed"
});
});